package com.example.asm_kotlin.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.asm_kotlin.R


@Composable
fun WellcomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFFFFFFF)),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Image(painter = painterResource(id = R.drawable.bgimage),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                )
            Column(

                verticalArrangement = Arrangement.Center,

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = ss(170), horizontal = ss(24),),

                ) {
                Text(text = "MAKE YOUR",
                    color = Color(0xFF606060),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W600,
                    lineHeight = 30.47.sp,
                    )
                Text(text = "HOME BEAUTIFUL",
                    color = Color(0xFF303030),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W600,
                    lineHeight = 53.6.sp,)
                Text(text = "The best simple place where you\n discover most wonderful furnitures \nand make your home beautiful",
                    color = Color(0xFF808080),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.W400,
                  )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(
                            top = ss(275),
                            start = ss(30),
                            end = ss(30)
                        )
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFF232323),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .shadow(
                            elevation = 20.dp,
                            spotColor = Color(0x40303030),

                            )
                        .padding(vertical = ss(18))
                ) {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                           containerColor = Color(0xFF232323),

                        ),
                        onClick = { navController.navigate("login_screen") },
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .fillMaxWidth(),
                    ) {
                        Text(
                            text = "Get Started",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                    }
                }

            }



        }


    }
}