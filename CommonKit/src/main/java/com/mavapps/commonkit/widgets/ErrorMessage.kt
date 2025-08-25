package com.mavapps.commonkit.widgets

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun ErrorMessage(message: String) {
    Box(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(10.dp),
        contentAlignment = Alignment.Center,

    ) {
        Text(

            text = message,
            modifier =  Modifier.fillMaxWidth(),
            color = Color.White,
            textAlign = TextAlign.Center

        )
    }
}
