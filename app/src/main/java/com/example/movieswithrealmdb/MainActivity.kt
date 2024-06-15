package com.example.movieswithrealmdb

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieswithrealmdb.database.RealmSyncService
import com.example.movieswithrealmdb.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    var baseURL = "https://api.themoviedb.org/"
    var accessToken = "bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhY2U4MDBkZWQwYzE2MjdhMzgyMjgyYWYyZWEzZDMwNSIsInN1YiI6IjY2MjAzZmMxMjBhZjc3MDE3ZDNmYjNmYiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.yz5GnmAXBy1v0mh3EejPuO3R3q3raPut6awhc4PAv7s"
    var apiKey = "ace800ded0c1627a382282af2ea3d305"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()
    }

    fun getData(){
        val retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(MoviesService::class.java)
        val call = service.getMovies (accessToken, apiKey)

        call.enqueue(object : retrofit2.Callback<MoviesResponse> {
            override fun onResponse(call: Call<MoviesResponse>, response: Response<MoviesResponse>) {
                if (response.code() == 200) {
                    val moviesResponse = response.body()!!

                    val realmSyncService = RealmSyncService()
                    realmSyncService.doSync(moviesResponse)

                    var recyclerView = binding.moviesRecyclerView
                    recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

                    var adapter = MoviesAdapter(moviesResponse.results)
                    recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: retrofit2.Call<MoviesResponse>, t: Throwable) {
                showToast(t.message.toString())
            }
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}