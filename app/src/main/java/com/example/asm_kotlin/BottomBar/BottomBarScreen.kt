package com.example.asm_kotlin.BottomBar

sealed class BottomBarScreen(val route: String) {
    object Home : BottomBarScreen("home")
    object Favorite : BottomBarScreen("favorite")
    object Notifications : BottomBarScreen("notifications")
    object Profile : BottomBarScreen("profile")
}
