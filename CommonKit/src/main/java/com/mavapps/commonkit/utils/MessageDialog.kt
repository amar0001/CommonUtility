package com.mavapps.commonkit.utils

import android.R
import androidx.annotation.StringRes
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource

@Composable
fun MessageDialog(
    @StringRes titleId: Int,
    @StringRes messageId: Int,
    onConfirm: () -> Unit,
    onDismissRequest: () -> Unit
) {
    val title = stringResource(titleId)
    val message = stringResource(messageId)
    AlertDialog(
        onDismissRequest = onDismissRequest,
        title = { Text(text = title) },
        text = { Text(text = message) },
        confirmButton = {
            Button(onClick = onConfirm) {
                Text(text = stringResource(id = R.string.ok))
            }
        },
        dismissButton = {
            Button(onClick = onDismissRequest) {
                Text(text = stringResource(id = R.string.cancel))
            }
        }
    )
}

// Example usage within a Composable function
@Composable
fun ExampleUsage() {
    var showDialog by remember { mutableStateOf(true) }

//    if (showDialog) {
//        MessageDialog(
//            titleId = R.string.ok,
//            message = "This is a message.",
//            onDismissRequest = { showDialog = false }
//        )
//    }
}