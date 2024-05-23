package com.example.asm_kotlin.BottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,

    ) {
    object Home : BottomBarScreen(
        "home",
        "Home",
        Icons.Default.Home)
    object Favorites : BottomBarScreen(
        "favorites",
        "Favorites",
        Icons.Default.Favorite)
    object Notification : BottomBarScreen(
        "notification",
        "Notification",
        Icons.Default.Notifications)
    object Profile : BottomBarScreen(
        "profile",
        "Profile",
        Icons.Default.Person)

}



