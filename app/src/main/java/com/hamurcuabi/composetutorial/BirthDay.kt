package com.hamurcuabi.composetutorial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = message,
            fontSize = 36.sp,
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic
        )
    }
}