package com.mavapps.commonkit.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextWidgetHeader(text : String, modifier: Modifier = Modifier) {
    TextWidgetCommon(text, 18.sp, modifier)
}

@Composable
fun TextWidgetNormal(text : String, modifier: Modifier = Modifier) {
    TextWidgetCommon(text, 15.sp, modifier)
}

@Composable
private fun TextWidgetCommon(text: String, fontSize: TextUnit, modifier: Modifier = Modifier) {

    Text(
        text = text,
        color = MaterialTheme.colorScheme.onBackground,
        style = TextStyle(
            fontSize = fontSize,
            fontWeight = FontWeight.Medium
        ),
        modifier = modifier
            .padding(5.dp)
    )
}