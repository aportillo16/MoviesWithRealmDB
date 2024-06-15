package com.example.movieswithrealmdb.database

import com.example.movieswithrealmdb.MoviesResponse
import io.realm.kotlin.Realm
import io.realm.kotlin.UpdatePolicy
import io.realm.kotlin.ext.query
import io.realm.kotlin.ext.toRealmList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RealmMoviesDAO : BaseDAO() {
    companion object {
        val STORES = listOf(
            RealmMoviesResponse::class,
            RealmResultList::class
        ).toSet()
    }

    fun upsertRealmMovies(moviesResponse: MoviesResponse): Flow<Boolean> {
        return flow {
            val realm = Realm.open(config)
            realm.write {
                copyToRealm(RealmMoviesResponse().apply {
                    page = moviesResponse.page
                    totalPages = moviesResponse.totalPages
                    totalResults = moviesResponse.totalResults
                    results = moviesResponse.results.map{apiItem->
                        RealmResultList().apply{
                            adult = apiItem.adult
                            backdropPath = apiItem.backdropPath
                            genreIDS.addAll(apiItem.genreIDS)
                            originalTitle = apiItem.originalTitle
                            overview = apiItem.overview
                            popularity = apiItem.popularity
                            posterPath = apiItem.posterPath
                            releaseDate = apiItem.releaseDate
                            title = apiItem.title
                            video = apiItem.video
                            voteAverage = apiItem.voteAverage
                            voteCount = apiItem.voteCount
                        }
                    }.toRealmList()
                }, updatePolicy = UpdatePolicy.ALL)
            }
            realm.close()
            emit(true)
        }
    }

    fun getRealmMovies(): Flow<MoviesResponse?>  {
        return flow {
            val realm = Realm.open(config)
            var result: MoviesResponse? = null
            realm.write {
                val realMoviesResponse = realm.query<RealmMoviesResponse>().find()
                val realmMovie = realMoviesResponse.first()
                result = realmMovie.toMoviesResponse()
            }
            realm.close()
            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}