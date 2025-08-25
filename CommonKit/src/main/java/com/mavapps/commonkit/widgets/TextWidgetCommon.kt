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
fun HeaderText(text: String,fontSize : TextUnit,
               modifier: Modifier = Modifier) {
    val textStyle = TextStyle(
        fontSize = fontSize,
        fontWeight = FontWeight.Medium
    )
    TextWidgetBase(text, textStyle, modifier)
}

/**
 * val textStyle = TextStyle(
 *         fontSize = 18.sp,
 *         fontWeight = FontWeight.Medium
 *     )
 *
 */
@Composable
fun HeaderText(text: String,textStyle : TextStyle,
               modifier: Modifier = Modifier) {

    TextWidgetBase(text, textStyle, modifier)
}

@Composable
fun HeaderText(text: String,
               modifier: Modifier = Modifier) {
    val textStyle = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )

    TextWidgetBase(text, textStyle, modifier)
}

@Composable
fun SimpleText(text: String,
               modifier: Modifier = Modifier) {
    val textStyle = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium
    )

    TextWidgetBase(text, textStyle, modifier)
}

@Composable
private fun TextWidgetBase(
    text: String,
    textStyle: TextStyle,
    modifier: Modifier = Modifier
) {

    Text(
        text = text,
        color = MaterialTheme.colorScheme.onBackground,
        style = textStyle,
        modifier = modifier
            .padding(5.dp)
    )
}