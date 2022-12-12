package com.hamurcuabi.composetutorial

import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculator {

    @Test
    fun calculate_18_percent_tip_no_roundup() {
        val amount = 100
        val tipPercent = 18
        val expectedTip = "18.0 ₺"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent)
        assertEquals(expectedTip, actualTip)
    }
}