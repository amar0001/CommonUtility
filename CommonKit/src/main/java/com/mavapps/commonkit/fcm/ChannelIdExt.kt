package com.mavapps.commonkit.fcm

import android.app.Activity
import android.app.NotificationChannel
import android.app.NotificationManager
import com.mavapps.commonkit.R


fun channelId(context : Activity) {
    val channelId = context.getString(R.string.default_notification_channel_id)  // This must be a string
    val channelName = context.getString(R.string.important_notifications)
    val importance = NotificationManager.IMPORTANCE_DEFAULT

    val notificationChannel = NotificationChannel(channelId, channelName, importance).apply {
        description = context.getString(R.string.this_is_for_important_notifications)
    }

    // Register the channel with the system
    val notificationManager = context.getSystemService(NotificationManager::class.java)
    notificationManager?.createNotificationChannel(notificationChannel)

}