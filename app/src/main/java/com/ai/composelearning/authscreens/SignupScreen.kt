package com.ai.composelearning.authscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
fun SignupScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Signup screen",
            modifier = Modifier.padding(top = 1.dp),
            color = Color.Black,
            fontSize = 30.sp
        )

        OutlinedTextFieldDefaults(
            label = "Enter your First name",
            placeholder = "Enter your First name"
        )
        OutlinedTextFieldDefaults(
            label = "Enter your last name",
            placeholder = "Enter your last name"
        )
        OutlinedTextFieldDefaults(
            label = "Enter your Email",
            placeholder = "Enter your Email"
        )
        Button(onClick = {
            navController.navigate(Screens.Login.route){
                popUpTo(Screens.Login.route) {
                    inclusive = true
                }
            }
        }, modifier = Modifier.padding(top = 20.dp)) {
            Text(text = "Submit")
        }
    }
}

@Composable
fun OutlinedTextFieldDefaults(
    label: String,
    placeholder: String,
) {
    var text by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(label) },
        placeholder = { Text(placeholder) },
    )

}

@Composable
@Preview
fun PreviewSignupScreen() {
    SignupScreen(navController = rememberNavController())
}