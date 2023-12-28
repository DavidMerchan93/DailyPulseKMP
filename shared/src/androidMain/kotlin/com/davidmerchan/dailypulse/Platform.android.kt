package com.davidmerchan.dailypulse

import android.content.res.Resources
import android.os.Build
import kotlin.math.round

actual class Platform {
    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = "${Build.VERSION.SDK_INT}"
    actual val deviceModel: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL}"
    actual val density: Float
        get() = round(Resources.getSystem().displayMetrics.density)
    actual val appVersion: String
        get() = "[1.0.0]"

    actual fun logPlatformInfo() {
        println("OS: $osName, osVersion: $osVersion, deviceModel: $deviceModel, density: $density, appVersion: $appVersion")
    }

}
