package com.mavapps.commonkit.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HighlightResults(
    options: List<String>,
    selectedOption: String?,
    answer: String
) {
    Column {
        options.forEach { option ->
            // Compute color and font color for each row based on the logic
            val color = when {
                selectedOption == option && option == answer -> Color.Green // Correct answer
                selectedOption == option && option != answer -> Color.Red // Incorrect answer
                option == answer -> Color.Green
                else -> Color.Transparent // Default
            }

            val fontColor = if (selectedOption == option) MaterialTheme.colorScheme.surface else MaterialTheme.colorScheme.onBackground

            Row(
                modifier = Modifier.height(50.dp).fillMaxWidth().background(color),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = option == selectedOption,
                    onClick = { }, Modifier,
                )
                Text(
                    text = option,
                    color = fontColor,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier

                )
            }
        }
    }
}


