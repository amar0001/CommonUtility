package com.mavapps.commonkit.utils

import android.content.Context
import java.util.Locale
import java.util.TimeZone

// Get current locale
fun Context.getLocale(): Locale {
    return resources.configuration.locales[0]
}

// Get current language (e.g., "en")
fun Context.getLanguage(): String {
    return getLocale().language
}

// Get current country code (e.g., "US")
fun Context.getCountry(): String {
    return getLocale().country
}

// Get current country display name (e.g., "United States")
fun Context.getCountryDisplayName(): String {
    return getLocale().displayCountry
}

// Get current language display name (e.g., "English")
fun Context.getLanguageDisplayName(): String {
    return getLocale().displayLanguage
}

// Get current time zone ID (e.g., "Asia/Kolkata")
fun getTimeZoneId(): String {
    return TimeZone.getDefault().id
}

// Get time zone display name (e.g., "India Standard Time")
fun getTimeZoneDisplayName(): String {
    return TimeZone.getDefault().displayName
}

// Get time zone raw offset in milliseconds
fun getTimeZoneOffsetMillis(): Int {
    return TimeZone.getDefault().rawOffset
}
