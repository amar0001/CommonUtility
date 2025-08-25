package com.mavapps.commonkit.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun CheckBoxWidget(onOptionSelected: (Boolean) -> Unit, text: String) {

    var isChecked by remember { mutableStateOf(false) }

    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { isChecked = !isChecked
        onOptionSelected(isChecked)}) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it
                onOptionSelected(isChecked)
            } // Update the checkbox state
        )
        SimpleText(text = text)
    }
}