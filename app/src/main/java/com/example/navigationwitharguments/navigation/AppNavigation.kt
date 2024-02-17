package com.example.navigationwitharguments.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationwitharguments.screens.DetailScreen
import com.example.navigationwitharguments.screens.ListScreen

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.ListScreen.name ){
        composable(
            route = Screens.ListScreen.name
        ){
            ListScreen(onClick = { userId ->
                navController.navigate(
                    route = "${Screens.DetailScreen.name}/$userId"
                )
            })
        }

        composable(
            route = "${Screens.DetailScreen.name}/{userId}",
            arguments = listOf(navArgument("userId"){
                type = NavType.IntType
            })
        ){
            it.arguments?.getInt("userId").let {userId ->
                DetailScreen(userId = userId!!)
            }
        }
    }
}