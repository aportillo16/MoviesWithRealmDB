package com.example.movieswithrealmdb.database

import com.example.movieswithrealmdb.MoviesResponse
import com.example.movieswithrealmdb.Result

fun RealmMoviesResponse.toMoviesResponse() = MoviesResponse(
    page = page,
    totalPages = totalPages,
    totalResults = totalResults,
    results = results.map{it.toResult()}
)

fun RealmResultList.toResult() = Result(
    adult = adult,
    backdropPath = backdropPath,
    genreIDS = genreIDS,
    id = id,
    originalTitle = originalTitle,
    overview = overview,
    popularity = popularity,
    posterPath = posterPath,
    releaseDate = releaseDate,
    title = title,
    video = video,
    voteAverage = voteAverage,
    voteCount = voteCount
)