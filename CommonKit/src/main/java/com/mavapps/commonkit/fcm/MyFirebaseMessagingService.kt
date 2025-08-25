package com.mavapps.commonkit.fcm

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.mavapps.commonkit.R


class MyFirebaseMessagingService : FirebaseMessagingService() {
    companion object {
        var notificationHandler: FcmNotificationHandler? = null
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
    }
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        // Access the data from the RemoteMessage
        val data = remoteMessage.data
        val title = remoteMessage.notification?.title
        val body = remoteMessage.notification?.body
        val customData = data["google.c.a.c_l"] // Example of reading custom payload data
        val productId = data["google.product_id"]

        val intent = Intent(this, NotificationClickReceiver::class.java).apply {
            putExtra("data", HashMap(data)) // pass payload
        }

        // Create intent for notification click action
//        val intent = Intent(this, MainActivity::class.java).apply {
//            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//        }

        val pendingIntent = PendingIntent.getActivity(
            this, 0, intent, PendingIntent.FLAG_ONE_SHOT or PendingIntent.FLAG_IMMUTABLE
        )




        // Build notification
        val notificationBuilder = NotificationCompat.Builder(this, getString(R.string.default_notification_channel_id))
            .setContentTitle(title)
            .setContentText(body)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

//        // Load image if available
//        imageUrl?.let {
//            val bitmap = BitmapFactory.decodeStream(URL(imageUrl).openConnection().getInputStream())
//            notificationBuilder.setLargeIcon(bitmap)
//            notificationBuilder.setStyle(NotificationCompat.BigPictureStyle().bigPicture(bitmap))
//        }

        // Show notification
        val notificationManager =
            getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.notify(0, notificationBuilder.build())
    }
}
