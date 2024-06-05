package com.ai.composelearning.navigations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ai.composelearning.authscreens.LoginScreen
import com.ai.composelearning.authscreens.SignupScreen

fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation(
        route = AUTH_GRAPH_ROUTE,
        startDestination = Screens.Login.route
    ) {
        composable(route = Screens.Login.route) {
            LoginScreen(navController = navController)
        }
      composable(route = Screens.SignUp.route) {
            SignupScreen(navController = navController)
        }
    }
}