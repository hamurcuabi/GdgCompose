package com.hamurcuabi.composetutorial

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextInput
import com.hamurcuabi.composetutorial.ui.theme.ComposeTutorialTheme
import org.junit.Rule
import org.junit.Test

class TipCalculatorUi {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun calculate_18_percent_tip() {
        composeTestRule.setContent {
            ComposeTutorialTheme {
                TipTimeScreen()
            }
        }
        composeTestRule
            .onNodeWithTag("edtAmount")
            .performTextInput("100")

        composeTestRule
            .onNodeWithTag("txtAmount")
            .assertExists()
    }
}