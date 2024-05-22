package com.example.asm_kotlin.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavHostController
import com.example.asm_kotlin.R

@Composable
fun LoginScreen(navController: NavHostController) {
    // State to track whether password should be visible or not
    val passwordVisible = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = Color.White
                )
                .padding(top = ss(18), bottom = ss(97))
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = ss(33), start = ss(14), end = ss(14))
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .width(ss(105))
                        .height(ss(3))
                        .background(color = Color(0xFFBDBDBD)),
                ) {
                }
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .width(ss(63))
                        .background(color = Color(0xFFFFFFFF))
                        .padding(vertical = ss(11), horizontal = ss(15)),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.anhlogin1),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(40.dp)
                            .fillMaxWidth()
                    )
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Column(
                            modifier = Modifier
                                .padding(
                                    bottom = ss(4), start = ss(3), end = ss(3),
                                )
                                .width(ss(1))
                                .height(ss(2))
                                .background(
                                    color = Color(0xFF303030),
                                )
                        ) {

                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .width(ss(105))
                        .height(ss(3))
                        .background(color = Color(0xFFBDBDBD)),

                    ) {

                }
            }
            /// close head logo
            Text(text = "Hello!",
                color = Color(0xFF909090),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding
                        ( start = ss(30), end = ss(30))
                    .width(ss(315))
                )
            Text(
                text = "WELLCOME BACK",
                color = Color(0xff303030),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding
                        (bottom = ss(51), start = ss(30), end = ss(30))
                    .width(ss(315))
            )
            /// Close head text
            Column(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .width(ss(345))
                            .height(ss(1000))
                            .background(color = Color(0xffffffff))
                            .shadow(
                                elevation = 30.dp,
                                spotColor = Color(0x338A959E),
                            )
                            .padding(top = ss(40), bottom = ss(40), start = ss(20))
                    ) {
                        // Email
                        Text(
                            text = "Email",
                            color = Color(0xFF909090),
                            fontSize = 14.sp,
                            modifier = Modifier.padding(bottom = ss(10), start = ss(32))
                        )
                        val emailState = remember { mutableStateOf("") }
                        TextField(
                            value = emailState.value,
                            onValueChange = { emailState.value = it },
                            modifier = Modifier
                                .padding(bottom = ss(4), end = ss(14))
                                .fillMaxWidth(),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                unfocusedIndicatorColor = Color("#E0E0E0".toColorInt()),
                                focusedIndicatorColor = Color.Gray
                            ),
                            placeholder = { Text(text = "") }
                        )
                        Text(
                            text = "Password",
                            color = Color(0xFF909090),
                            fontSize = 14.sp,
                            modifier = Modifier.padding(
                                bottom = ss(10),
                                top = ss(15),
                                start = ss(32)
                            )
                        )
                        val passState = remember { mutableStateOf("") }
                        TextField(
                            value = passState.value,
                            onValueChange = { emailState.value = it },
                            modifier = Modifier
                                .padding(bottom = ss(4), end = ss(14))
                                .fillMaxWidth(),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                unfocusedIndicatorColor = Color("#E0E0E0".toColorInt()),
                                focusedIndicatorColor = Color.Gray
                            ),
                            placeholder = { Text(text = "") }
                        )
                        /// Text fogot
                        Column( horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(
                                    bottom = ss(20),
                                    start = ss(30),
                                    end = ss(30),
                                    top = ss(10)
                                )) {
                            Text(
                                text = "Forgot Password",
                                color = Color(0xFF303030),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = ss(20), top = ss(20), start = ss(57))
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(
                                    bottom = ss(36),
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
                            Text(text = "Login",
                                color = Color(0xFFFFFFFF),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                               )
                        }
                        Column( horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(
                                    bottom = ss(36),
                                    start = ss(30),
                                    end = ss(30)
                                )) {
                            Text(
                                text = "SIGN UP",
                                color = Color(0xFF303030),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = ss(41), start = ss(90))
                            )
                        }
                    }
                }
            }
        }
    }
}

// Định nghĩa hàm ss
fun ss(value: Int): Dp {
    return value.dp
}

