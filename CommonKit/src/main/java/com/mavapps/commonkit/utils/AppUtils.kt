package com.mavapps.commonkit.utils



import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.widget.Toast
import androidx.core.content.ContextCompat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

// Show Toast anywhere
fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

// Get version name
fun Context.getAppVersionName(): String? {
    return try {
        packageManager.getPackageInfo(packageName, 0).versionName
    } catch (e: PackageManager.NameNotFoundException) {
        "N/A"
    }
}

// Get version code
fun Context.getAppVersionCode(): Long {
    return try {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            packageManager.getPackageInfo(packageName, 0).longVersionCode
        } else {
            @Suppress("DEPRECATION")
            packageManager.getPackageInfo(packageName, 0).versionCode.toLong()
        }
    } catch (e: PackageManager.NameNotFoundException) {
        -1
    }
}

// Check permission (for runtime permissions)
fun Context.hasPermission(permission: String): Boolean {
    return ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
}

// Finish activity safely
fun Activity.safeFinish() {
    if (!isFinishing) {
        finish()
    }
}

// Format current date/time
fun getFormattedDate(format: String = "dd MMM yyyy, hh:mm a"): String {
    val sdf = SimpleDateFormat(format, Locale.getDefault())
    return sdf.format(Date())
}
