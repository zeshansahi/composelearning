package com.ai.composelearning

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun GoogleLoginButton() {
    var clicked by remember { mutableStateOf(false) }
    Surface(modifier = Modifier
        .clip(MaterialTheme.shapes.medium)
        .clickable {
            clicked = !clicked
        }
    ) {
        Row(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 12.dp,
                    bottom = 12.dp
                )
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),

            ) {
            Icon(
                modifier = Modifier.size(20.dp),
                painter = painterResource(id = R.drawable.google_logo),
                tint = Color.Unspecified,
                contentDescription = "google"
            )
            Text(text = "Sign in with Google", modifier = Modifier.padding(start = 8.dp))

            if (clicked) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(12.dp)
                        .width(12.dp)
                        .padding(
                            top = 12.dp,
                            bottom = 12.dp
                        ),
                    strokeWidth = 2.dp,
                    color = Color.Blue
                )
            }
        }
    }
}

@Composable
@Preview
fun GooglePreview() {
    GoogleLoginButton()
}