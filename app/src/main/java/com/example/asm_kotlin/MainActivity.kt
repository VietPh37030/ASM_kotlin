package com.example.asm_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm_kotlin.ui.HomeScreen
import com.example.asm_kotlin.ui.LoginScreen
import com.example.asm_kotlin.ui.SignUpScreen
import com.example.asm_kotlin.ui.WellcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "signup_screen") {
        composable("login_screen") { LoginScreen(navController) }
        composable("welldone_screen") { WellcomeScreen(navController) }
        composable("signup_screen") { SignUpScreen(navController) }
        composable("main_screen") { HomeScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
