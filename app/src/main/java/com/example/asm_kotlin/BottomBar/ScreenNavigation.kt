package com.example.asm_kotlin.BottomBar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm_kotlin.Screen.CheckOutScreen
import com.example.asm_kotlin.Screen.HomeScreen
import com.example.asm_kotlin.Screen.MyCartScreen
import com.example.asm_kotlin.Screen.ProductDetail
import com.example.asm_kotlin.Screens
import com.example.asm_kotlin.ui.LoginScreen
import com.example.asm_kotlin.ui.SignUpScreen
import com.example.asm_kotlin.ui.WellcomeScreen

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Wellcomme.router,
    ) {
        composable(Screens.Wellcomme.router) { WellcomeScreen(navController) }
        composable(Screens.Login.router) { LoginScreen(navController) }
        composable(Screens.SignUp.router) { SignUpScreen(navController) }
        composable(Screens.MyCart.router) { MyCartScreen(navController) }
        composable(Screens.ProductDetail.router) { ProductDetail(navController) }
        composable(Screens.Checkout.router) { CheckOutScreen(navController) }
    }
}