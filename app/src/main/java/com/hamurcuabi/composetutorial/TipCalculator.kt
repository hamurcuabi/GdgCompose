package com.hamurcuabi.composetutorial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TipTimeScreen() {
    var amountInput by remember { mutableStateOf("") }

    val amount = amountInput.toIntOrNull() ?: 0
    val tip = calculateTip(amount)

    Column(
        modifier = Modifier.padding(32.dp),
    ) {

        Text(
            text = "Bahşiş Hesaplayıcı",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(Modifier.height(16.dp))
        EditNumberField(
            value = amountInput,
            onValueChanged = { amountInput = it }
        )
        Spacer(Modifier.height(24.dp))
        val tipAmount = "Bahşiş Miktarı: $tip"
        Text(
            text = tipAmount,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .semantics { testTag = "txtAmount" },
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun EditNumberField(
    value: String,
    onValueChanged: (String) -> Unit
) {
    TextField(
        value = value,
        onValueChange = onValueChanged,
        label = {
            Text(
                text = "Toplam Hesap"
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .semantics { testTag = "edtAmount" },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

internal fun calculateTip(
    amount: Int,
    tipPercent: Int = 18
): String {
    val tip = tipPercent * amount / 100.0
    return "$tip ₺"
}