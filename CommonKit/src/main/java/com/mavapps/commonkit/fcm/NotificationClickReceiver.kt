package com.mavapps.commonkit.fcm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationClickReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val data = intent.getSerializableExtra("data") as? HashMap<String, String>
        MyFirebaseMessagingService.notificationHandler?.onNotificationClicked(data ?: emptyMap())
    }
}
