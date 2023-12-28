package com.davidmerchan.dailypulse

import platform.Foundation.NSLog
import platform.UIKit.UIDevice
import platform.UIKit.UIScreen

actual class Platform {
    actual val osName: String
        get() = UIDevice.currentDevice.systemName
    actual val osVersion: String
        get() = UIDevice.currentDevice.systemVersion
    actual val deviceModel: String
        get() = UIDevice.currentDevice.model
    actual val density: Float
        get() = UIScreen.mainScreen.scale.toFloat()
    actual val appVersion: String
        get() = "[1.0.0]"

    actual fun logPlatformInfo() {
        NSLog(
            "OS: $osName, osVersion: $osVersion, deviceModel: $deviceModel, density: $density, appVersion: $appVersion"
        )
    }

}
