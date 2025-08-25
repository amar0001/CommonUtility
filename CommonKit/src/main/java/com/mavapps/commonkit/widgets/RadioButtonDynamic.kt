package com.mavapps.commonkit.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RadioButtonDynamic(
    options: List<String>,
    selectedOption: String?,
    onOptionSelected: (String) -> Unit
) {
    Column {
        options.forEach { option ->
            Row(
                modifier = Modifier.clickable {
                    onOptionSelected(option)
                }.height(50.dp),
                verticalAlignment = Alignment.CenterVertically
                ) {
                RadioButton(
                selected = option == selectedOption,
                onClick = { onOptionSelected(option) },  Modifier,
                )
                Text(
                    text = option,
                    color = MaterialTheme.colorScheme.onBackground,
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


