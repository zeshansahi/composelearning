package com.ai.composelearning.authscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ai.composelearning.navigations.Screens

@Composable
fun LoginScreen(navController: NavController) {

    var firstName by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = "Login screen",
            modifier = Modifier
                .padding(top = 100.dp),
            fontSize = 28.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
        )
        OutlinedTextFieldSample(
            "First Name",
            "Enter your first name",
            modifier = Modifier
                .padding(top = 10.dp)
        )

        OutlinedTextFieldSample(
            "Last Name",
            "Enter your Last name",
            modifier = Modifier
                .padding(top = 10.dp)
        )

        Button(
            onClick = {
                navController.navigate(Screens.Home.route) {
                    popUpTo(Screens.Home.route) {
                        inclusive = true
                    }
                } },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Submit")
        }
    }
}

@Composable
fun OutlinedTextFieldSample(
    label: String,
    placeholder: String,
    modifier: Modifier = Modifier
) {
    var text by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        modifier = modifier,
        value = text,
        onValueChange = { text = it },
        label = { Text(label) },
        placeholder = { Text(placeholder) }
    )
}

@Composable
@Preview
fun PreviewLoginScreen() {
    LoginScreen(navController = rememberNavController())
}