package com.example.asm_kotlin.MainScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm_kotlin.BottomBar.BottomBarScreen
import com.example.asm_kotlin.Screen.A1ScreenContent
import com.example.asm_kotlin.Screen.FavoriteScreenContent
import com.example.asm_kotlin.Screen.HomeScreen
import com.example.asm_kotlin.Screen.HomeScreenContent
import com.example.asm_kotlin.Screen.NotificationScreen
import com.example.asm_kotlin.Screen.NotificationScreenContent

class MainScreens : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBottomAppBar()
        }
    }

    @Composable
    fun MyBottomAppBar() {
        val navController = rememberNavController()
        val selected = remember { mutableStateOf(Icons.Default.Home) }

        Scaffold(
            bottomBar = {
                BottomAppBar(containerColor = Color.Gray) {
                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Home
                            navController.navigate(BottomBarScreen.Home.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Home) Color.White else Color.DarkGray
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Favorite
                            navController.navigate(BottomBarScreen.Favorite.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Favorite) Color.White else Color.DarkGray
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Notifications
                            navController.navigate(BottomBarScreen.Notifications.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Notifications) Color.White else Color.DarkGray
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Person
                            navController.navigate(BottomBarScreen.Profile.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Person) Color.White else Color.DarkGray
                        )
                    }
                }
            }
        ) { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = BottomBarScreen.Home.route,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable(BottomBarScreen.Home.route) { HomeScreenContent() }
                composable(BottomBarScreen.Favorite.route) { FavoriteScreenContent() }
                composable(BottomBarScreen.Notifications.route) { NotificationScreenContent() }
                composable(BottomBarScreen.Profile.route) { A1ScreenContent() }
            }
        }
    }
}
