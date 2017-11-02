package com.rodrigobresan.cache.db

/**
 * Object containing the Database constants, such as name, version, etc
 */
object DbConstants {

    object DbConfig {
        val FILE_NAME = "sample-boilerplate-android-movies.db"
        val VERSION = 1
    }

    const val ENABLE_FOREIGN_KEYS = "PRAGMA foreign_keys=ON;"
}
