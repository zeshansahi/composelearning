package com.ai.composelearning.homescreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "About screen", fontSize = 22.sp)
            Button(
                onClick = {
                          navController.navigate(Screens.SignUp.route)
                          }, modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(
                        start = 20.dp,
                        top = 20.dp,
                        end = 20.dp
                    )
            ) {
                Text(text = "Click me")

            }
        }

    }
}

@Composable
@Preview
fun NewScreenPreview() {

    LoginScreen(rememberNavController())
}
