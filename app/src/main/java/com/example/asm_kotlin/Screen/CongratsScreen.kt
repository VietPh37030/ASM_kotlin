package com.example.asm_kotlin.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview
@Composable
fun CongratsScreen(navController: NavController? = null) {
    getLayout()
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
private fun getLayout(navController: NavController? = null) {
    Scaffold(
        content = {
            FullScreen()
        }
    )


}

@Composable
fun FullScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                color = Color(0xFFFFFFFF),
            )
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(color = Color.White)
            .padding(top = 18.dp, bottom = 104.dp)
            .verticalScroll(
                rememberScrollState()
            )
        )
        {
        Text(text = "SUCCESS!",
            color = Color(0xFF3030303),
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 30.dp, start = 95.dp)
            )
        }
    }
}
