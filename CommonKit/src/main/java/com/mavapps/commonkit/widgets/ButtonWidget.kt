package com.mavapps.commonkit.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonWidgetWrapContent(text: String = "Button Text",
                            buttonClick: () -> Unit = {}) {
    ButtonWidget(text, modifier = Modifier
        .wrapContentWidth()
        .wrapContentHeight(), buttonClick)
}

@Composable
fun ButtonWidget(
    text: String = "Button Text",
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(),
    buttonClick: () -> Unit = {},
) {

    Column(modifier = modifier) {


        Button(
            onClick = {
                buttonClick()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,  // Dynamically set background color
                contentColor = MaterialTheme.colorScheme.onPrimary           // Dynamically set text color
            ),
            modifier = Modifier
                .padding(top = 6.dp, bottom = 6.dp, start = 50.dp, end = 50.dp)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)


        ) {

            SimpleText(text)

        }
    }
}