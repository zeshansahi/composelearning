package com.ai.composelearning.navigations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.ai.composelearning.homescreens.DetailScreen
import com.ai.composelearning.homescreens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screens.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(Screens.Home.route) {
            HomeScreen(navController)
        }
        composable(Screens.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.StringType
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type=NavType.IntType
                    defaultValue = 0
                }
            )
        ) {
            DetailScreen(navController)
        }
    }
}
