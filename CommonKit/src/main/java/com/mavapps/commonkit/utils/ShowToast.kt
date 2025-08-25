package com.mavapps.commonkit.utils

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

@Composable
fun ShowToast(text : String) {
    // Access the current context
    val context = LocalContext.current

    // Remember a function to show a toast
    val showToast = remember {
        { message: String ->
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

    // Call this function wherever you want to show a toast
    showToast(text)
}