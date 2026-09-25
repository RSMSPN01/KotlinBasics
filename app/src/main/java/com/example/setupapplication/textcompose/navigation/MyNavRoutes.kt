package com.example.setupapplication.textcompose.navigation

import kotlinx.serialization.Serializable

// all the subclasses can only be defined here not in any other files.

@Serializable
sealed class MyNavRoutes {

    @Serializable
    data class welcomeScreen(val userName : String) : MyNavRoutes()
    @Serializable
    object loginScreen : MyNavRoutes()
    @Serializable
    object homeScreen : MyNavRoutes()
}