package com.example.setupapplication.textcompose.navigationbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NavBarUI(navController: NavHostController) {
    var items = listOf(
        NavItems("Home", Icons.Default.Home, NavBarRoutes.Home),
        NavItems("Search", Icons.Default.Search, NavBarRoutes.Search),
        NavItems("Notifications", Icons.Default.Notifications, NavBarRoutes.Notification),
        NavItems("Profile", Icons.Default.Person, NavBarRoutes.Profile)
    )
    NavigationBar() {
        items.forEach { item ->

            NavigationBarItem(
                selected = true,
                onClick = {
                    navController.navigate(item.routes) {
                        popUpTo(navController.graph.startDestinationId) { // clear the memory
                            saveState = true // stored the stated
                        }
                        launchSingleTop = true // only launch once even click on same icon
                        restoreState = true // restore the value open again, show the saved state
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = "null static value"
                    )
                },
                label = {
                    Text(
                        text = item.title
                    )
                },

                alwaysShowLabel = true
            )
        }
    }
}

data class NavItems(
    var title: String,
    var icon: ImageVector,
    var routes: NavBarRoutes
)