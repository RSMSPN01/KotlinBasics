package com.example.setupapplication.textcompose.navigationbar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavBarGraph() {
    val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = NavBarRoutes.Home
        ) {
            composable<NavBarRoutes.Home> {
                HomeScreenUI(navController)
            }
            composable<NavBarRoutes.Search> {
                SearchScreenUI(navController)
            }
            composable<NavBarRoutes.Profile> {
                ProfileScreenUI(navController)
            }
            composable<NavBarRoutes.Notification> {
                NotificationScreenUI(navController)
            }
        }


}