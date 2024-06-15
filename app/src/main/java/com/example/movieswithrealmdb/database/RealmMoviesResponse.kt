package com.example.movieswithrealmdb.database

import io.realm.kotlin.ext.toRealmList
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

open class RealmMoviesResponse() : RealmObject {
    @PrimaryKey
    var page: Long = 0
    var results: RealmList<RealmResultList> = listOf<RealmResultList>().toRealmList()
    var totalPages: Long = 0
    var totalResults: Long = 0
}

open class RealmResultList() : RealmObject {
    var adult: Boolean = false
    var backdropPath: String = ""
    var genreIDS: RealmList<Long> = listOf<Long>().toRealmList()
    @PrimaryKey
    var id: Long = 0
    var originalTitle: String = ""
    var overview: String = ""
    var popularity: Double = 0.0
    var posterPath: String = ""
    var releaseDate: String = ""
    var title: String = ""
    var video: Boolean = false
    var voteAverage: Double = 0.0
    var voteCount: Long = 0
}