package com.ai.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ai.composelearning.ui.theme.ComposelearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainContent()

        }
    }
}

@Composable
fun MainContent() {
    ComposelearningTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Greating()
            OutLinedText()
        }
    }
}

@Composable
fun Greating() {
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { newString ->
            text = newString
        },
        label = { Text("Enter your name") },
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "search") },
        trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "search") })
}

@Composable
fun OutLinedText() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { newString ->
            text = newString
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Search
        ),
        label = { Text("Enter your name") },
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "search") },
        trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "search") })
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainContent()
}