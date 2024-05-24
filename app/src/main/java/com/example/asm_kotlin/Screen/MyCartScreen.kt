package com.example.asm_kotlin.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import com.example.asm_kotlin.R

@Preview(showBackground = true)
@Composable
fun MyCartScreen(navController: NavController? = null) {
    getLayout()
}

@Composable
private fun getLayout(navController: NavController? = null) {
    Scaffold(topBar = {
        HeadScreen()
    },
        content = {
            BodyScreen()
        })


}

@Composable
fun HeadScreen() {
    Row(
        modifier = Modifier
            .background(Color("#fefefe".toColorInt()))
            .fillMaxWidth()
            .padding(
                start = 16.dp,
                top = 30.dp,
                end = 16.dp,
                bottom = 16.dp
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(onClick = { }) {
            Image(
                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = "search_icon",
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "My cart",
                fontFamily = FontFamily(Font(R.font.merriweather_regular)),
                fontWeight = FontWeight(700),
                fontSize = 18.sp,
                color = Color("#111111".toColorInt())
            )
        }
        IconButton(onClick = { }) {
            Image(
                painter = painterResource(id = R.drawable.popular),
                contentDescription = "search_icon",
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp)
            )
        }
    }
}

@Composable
fun BodyScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 120.dp)
            .background(color = Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Color(0xFFFFFFFF))
                .padding(top = 18.dp, bottom = 30.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .padding(bottom = 25.dp, start = 21.dp, end = 21.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFFFFFFFF))
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.chairone),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .width(100.dp)
                            .height(100.dp)
                    )
//                    IconButton(
//                        onClick = { /* handle exit action */ },
//                        modifier = Modifier
//                            .align(Alignment.TopEnd)
//                            .padding(4.dp)
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.exit), // Change this to your exit icon resource ID
//                            contentDescription = "exit_icon",
//                            modifier = Modifier
//                                .fillMaxSize()
//                        )
//                    }
                }
                Column(
                    modifier = Modifier
                        .padding(top = 5.dp, end = 4.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "Minimai Stand",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 9.dp, start = 1.dp)
                    )
                    Text(
                        text = "$ 25.00",
                        color = Color(0xFF232323),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 26.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.up),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                        Text(
                            text = "01",
                            color = Color(0xFF232323),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(end = 18.dp)
                        )
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.dow),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                    }// close tăng giảm số lượng
                }
                Box {
                    IconButton(
                        onClick = { /* handle exit action */ },
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(4.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.exit), // Change this to your exit icon resource ID
                            contentDescription = "exit_icon",
                            modifier = Modifier.width(24.dp).height(24.dp)
                        )
                    }
                }
            }/// Close item 1
            Row(
                modifier = Modifier
                    .padding(bottom = 25.dp, start = 21.dp, end = 21.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFFFFFFFF))
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.caffe),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .width(100.dp)
                            .height(100.dp)
                    )
//                    IconButton(
//                        onClick = { /* handle exit action */ },
//                        modifier = Modifier
//                            .align(Alignment.TopEnd)
//                            .padding(4.dp)
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.exit), // Change this to your exit icon resource ID
//                            contentDescription = "exit_icon",
//                            modifier = Modifier
//                                .fillMaxSize()
//                        )
//                    }
                }
                Column(
                    modifier = Modifier
                        .padding(top = 5.dp, end = 4.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "Coffee Table",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 9.dp, start = 1.dp)
                    )
                    Text(
                        text = "\$ 20.00",
                        color = Color(0xFF232323),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 26.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.up),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                        Text(
                            text = "01",
                            color = Color(0xFF232323),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(end = 18.dp)
                        )
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.dow),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                    }// close tăng giảm số lượng
                }
                Box {
                    IconButton(
                        onClick = { /* handle exit action */ },
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(4.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.exit), // Change this to your exit icon resource ID
                            contentDescription = "exit_icon",
                            modifier = Modifier.width(24.dp).height(24.dp)
                        )
                    }
                }
            }/// Close item 2
            Row(
                modifier = Modifier
                    .padding(bottom = 25.dp, start = 21.dp, end = 21.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFFFFFFFF))
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.den),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .width(100.dp)
                            .height(100.dp)
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(top = 5.dp, end = 4.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "Black Simple Lamp",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 9.dp, start = 1.dp)
                    )
                    Text(
                        text = "$ 25.00",
                        color = Color(0xFF232323),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 26.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.up),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                        Text(
                            text = "01",
                            color = Color(0xFF232323),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(end = 18.dp)
                        )
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.dow),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                    }// close tăng giảm số lượng
                }
                Box {
                    IconButton(
                        onClick = { /* handle exit action */ },
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(4.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.exit), // Change this to your exit icon resource ID
                            contentDescription = "exit_icon",
                            modifier = Modifier.width(24.dp).height(24.dp)
                        )
                    }
                }
            }/// Close item 3
            Row(
                modifier = Modifier
                    .padding(bottom = 25.dp, start = 21.dp, end = 21.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xFFFFFFFF))
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.deskone),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .width(100.dp)
                            .height(100.dp)
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(top = 5.dp, end = 4.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "Minimal Desk",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 9.dp, start = 1.dp)
                    )
                    Text(
                        text = "$ 25.00",
                        color = Color(0xFF232323),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 26.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.up),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                        Text(
                            text = "01",
                            color = Color(0xFF232323),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(end = 18.dp)
                        )
                        Column(
                            modifier = Modifier
                                .padding(end = 15.dp)
                                .width(30.dp)
                                .background(
                                    color = Color(0xFFE0e0e0),
                                    shape = RoundedCornerShape(6.dp)
                                )
                                .padding(horizontal = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.dow),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .height(14.dp)
                                    .fillMaxWidth()
                            )
                        }
                    }// close tăng giảm số lượng
                }
                Box {
                    IconButton(
                        onClick = { /* handle exit action */ },
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(4.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.exit), // Change this to your exit icon resource ID
                            contentDescription = "exit_icon",
                            modifier = Modifier.width(24.dp).height(24.dp)
                        )
                    }
                }
            }/// Close item 4
        }
    }
}


