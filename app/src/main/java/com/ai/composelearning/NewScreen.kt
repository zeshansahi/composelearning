package com.ai.composelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class NewScreen {

    @Composable
    fun AboutScreen() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Row {
                Box(modifier = Modifier
                    .height(100.dp)
                    .weight(1f)
                    .background(Color.Red)) {

                }
                Box(modifier = Modifier

                    .height(100.dp)
                    .weight(1f)
                    .background(Color.Gray, shape = RoundedCornerShape(50.dp))
                    ) {

                }
            }

        }
    }

    @Composable
    @Preview
    fun NewScreenPreview() {

        AboutScreen()
    }
}