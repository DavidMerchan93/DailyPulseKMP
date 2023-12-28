package com.davidmerchan.dailypulse

expect class Platform {
    val osName: String
    val osVersion: String
    val deviceModel: String
    val density: Float
    val appVersion: String

    fun logPlatformInfo()
}
