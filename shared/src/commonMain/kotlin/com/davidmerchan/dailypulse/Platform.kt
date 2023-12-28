package com.davidmerchan.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform