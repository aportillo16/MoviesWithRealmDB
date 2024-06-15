package com.example.movieswithrealmdb.database

import io.realm.kotlin.RealmConfiguration

open class BaseDAO {
    private val allStores by lazy {
        RealmMoviesDAO.STORES
    }

    companion object {
        private const val DATABASE_SCHEMA_VERSION = 1L
    }

    val config by lazy {
        RealmConfiguration
            .Builder(allStores)
            .name("bah.realm")
            .schemaVersion(DATABASE_SCHEMA_VERSION)
            .deleteRealmIfMigrationNeeded()
            .build()

    }

}