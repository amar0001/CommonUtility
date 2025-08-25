package com.mavapps.commonkit.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

private const val DD_MMM_YYYY_HH_MM_A = "dd MMM yyyy, hh:mm a"

// Format current date/time
fun getFormattedDate(format: String = DD_MMM_YYYY_HH_MM_A): String {
    val sdf = SimpleDateFormat(format, Locale.getDefault())
    return sdf.format(Date())
}
