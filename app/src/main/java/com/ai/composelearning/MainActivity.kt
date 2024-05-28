package com.ai.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ai.composelearning.ui.theme.ComposelearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    ComposelearningTheme {
        CustomBox()
    }
}

@Composable
fun CustomBox() {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter) {

        Box(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .background(Color.Blue)
        )
        Text(text = "Hello")

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainContent()
}