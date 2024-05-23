package com.example.asm_kotlin.BottomBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.asm_kotlin.BottomBar.BottomBarScreen
import com.example.asm_kotlin.Screen.FavoritScreen
import com.example.asm_kotlin.Screen.HomeScreen
import com.example.asm_kotlin.Screen.NotificationScreen
import com.example.asm_kotlin.Screen.ProfileScreen

@Composable
fun BottmNaVGraph(navController: NavHostController){
NavHost(navController = navController, startDestination = BottomBarScreen.Home.route ) {
    composable(route = BottomBarScreen.Home.route){
        HomeScreen()
    }
    composable(route = BottomBarScreen.Favorites.route){
        FavoritScreen()
    }
    composable(route = BottomBarScreen.Notification.route){
        NotificationScreen()
    }
    composable(route = BottomBarScreen.Profile.route){
        ProfileScreen()
    }
}
}