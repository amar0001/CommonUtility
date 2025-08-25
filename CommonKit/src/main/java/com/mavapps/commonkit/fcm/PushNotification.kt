package com.utility.fcm

data class PushNotification(
    val data: NotificationData,
    val to: String // This should be the FCM token of the device receiving the notification
)

data class NotificationData(
    val title: String,
    val message: String
)