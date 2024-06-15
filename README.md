REALM DB CONSUMIENDO PELÍCULAS

DESCRIPCIÓN: Utilizar un servicio de internet por medio de RETROFIT para descargar set de películas las cuales, luego se almacenarán en una base de datos REALM en el dispositivo. 

Se mostrarán al usuario utilizando CardView que se cargarán en el RECICLERVIEW.

Los datos utilizados para el acceso al servicio son los siguientes:

var baseURL = "https://api.themoviedb.org/"

    @GET("3/movie/popular")
    fun getMovies(@Header("Authorization") authHeader: String,
                  @Query("api_key") apiKey: String): Call<MoviesResponse>

var accessToken = "bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhY2U4MDBkZWQwYzE2MjdhMzgyMjgyYWYyZWEzZDMwNSIsInN1YiI6IjY2MjAzZmMxMjBhZjc3MDE3ZDNmYjNmYiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.yz5GnmAXBy1v0mh3EejPuO3R3q3raPut6awhc4PAv7s"

var apiKey = "ace800ded0c1627a382282af2ea3d305"

![image](https://github.com/aportillo16/MoviesWithRealmDB/assets/166572036/3e056873-8299-41b3-a763-000c879fa289)


RESULTADO:

![image](https://github.com/aportillo16/MoviesWithRealmDB/assets/166572036/1a94d0df-0744-4fd1-9a34-66092e9ce502)
