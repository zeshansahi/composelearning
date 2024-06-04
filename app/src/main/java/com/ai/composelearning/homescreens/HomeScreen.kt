package com.ai.composelearning.homescreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ai.composelearning.navigations.Screens


@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Home screen")
        Button(onClick = {
            navController.navigate(
                route = Screens.Detail.passNaveAndId(
                    id = 11,
                    name = "zeshan"
                )
            )
        }) {
            Text(text = "View detail")
        }
        Button(onClick = {
            navController.navigate(
                route = Screens.Login.route
            )
        }) {
            Text(text = "Go to Login")
        }

    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}