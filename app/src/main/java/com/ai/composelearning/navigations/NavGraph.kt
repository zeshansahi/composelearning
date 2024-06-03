package com.ai.composelearning.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUT
    ) {
        homeNavGraph(navController)

    }
}