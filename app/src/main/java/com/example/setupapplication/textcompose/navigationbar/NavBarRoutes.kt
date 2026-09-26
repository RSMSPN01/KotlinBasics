package com.example.setupapplication.textcompose.navigationbar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {
    @Serializable
    data object Home : NavBarRoutes()

    @Serializable
    data object Search : NavBarRoutes()

    @Serializable
    data object Profile : NavBarRoutes()

    @Serializable
    data object Notification : NavBarRoutes()
}