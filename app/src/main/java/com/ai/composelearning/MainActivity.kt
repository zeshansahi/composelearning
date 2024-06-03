package com.ai.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ai.composelearning.navigations.SetupNavGraph
import com.ai.composelearning.simpleviews.GoogleLoginButton
import com.ai.composelearning.ui.theme.ComposelearningTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            MainContent()
            navController = rememberNavController()
            SetupNavGraph(navController = navController)
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
            GoogleLoginButton()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainContent()
}