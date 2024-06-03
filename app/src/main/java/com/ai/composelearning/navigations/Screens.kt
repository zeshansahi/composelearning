package com.ai.composelearning.navigations


const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val ROOT_GRAPH_ROUT = "root"
const val HOME_GRAPH_ROUTE = "home"

sealed class Screens(val route: String) {
    object Home : Screens(route = "home_screen")
    object Detail : Screens(route = "detail_screen?id={id}&name={name}") {
        fun passNaveAndId(
            id: Int = 0,
            name: String = "zeshan"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }

}