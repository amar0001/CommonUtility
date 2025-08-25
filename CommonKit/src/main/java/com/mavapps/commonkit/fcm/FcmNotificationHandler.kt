package com.mavapps.commonkit.fcm

interface FcmNotificationHandler {
    fun onMessageReceived(data: Map<String, String>)
    fun onNotificationClicked(data: Map<String, String>)
}
