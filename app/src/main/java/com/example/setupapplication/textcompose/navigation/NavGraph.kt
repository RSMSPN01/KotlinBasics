package com.example.setupapplication.textcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.loginScreen
    ) {
        composable <MyNavRoutes.loginScreen>{
            LoginScreenUi(navController)
        }
        composable <MyNavRoutes.homeScreen>{
            HomeScreenUi(navController)
        }
        composable<MyNavRoutes.welcomeScreen> { backStackEntry ->
            val data = backStackEntry.toRoute<MyNavRoutes.welcomeScreen>()
            WelcomeScreenUi(data.userName,navController)
        }
    }
}