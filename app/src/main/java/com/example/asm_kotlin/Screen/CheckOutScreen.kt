package com.example.asm_kotlin.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import com.example.asm_kotlin.R

@Preview
@Composable
fun CheckOutScreen(navController: NavController? = null) {
    getLayout()
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
private fun getLayout(navController: NavController? = null) {
    Scaffold(
        topBar = {
            Headcheckout()
        }, content = {
            Bodycheckout()
        }, bottomBar = {
            Footcheckout()
        }
    )
}


@Composable
fun Headcheckout(navController: NavController? = null) {
    Row(
        modifier = Modifier
            .background(Color("#fefefe".toColorInt()))
            .fillMaxWidth()
            .padding(
                start = 16.dp, top = 30.dp, end = 16.dp, bottom = 16.dp
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
                    .clickable(
                        onClick = {
                            navController?.popBackStack()
                        })
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Check out",
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
fun Bodycheckout() {
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
                .padding(top = 18.dp, bottom = 35.dp)
                .verticalScroll(rememberScrollState())
        ) {
            /// Bọc 2 dòng đầu
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 11.dp, start = 21.dp, end = 21.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Shipping Address",
                    color = Color(0xFF909090),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.pen),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(16.dp)
                        .height(19.dp)
                )
            }//Close nav
            ///Nav box 2
            Column(
                modifier = Modifier
                    .padding(bottom = 32.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .shadow(
                        elevation = 40.dp,
                        spotColor = Color(0x338A959E)
                    )
                    .padding(vertical = 21.dp)
            ) {
                Text(
                    text = "Bruno Fernandes",
                    color = Color(0xFF303030),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(bottom = 11.dp, start = 21.dp)
                )
                ///
                Column(
                    modifier = Modifier
                        .padding(bottom = 17.dp)
                        .height(2.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFF0F0F0),
                            shape = RoundedCornerShape(6.dp)
                        )
                ) {
                }
                Text(
                    text = "25 rue Robert Latouche, Nice, 06200, Côte D’azur, France",
                    color = Color(0xFF808080),
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .width(295.dp)
                )
            }
            ///Nav box 3
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 10.dp, start = 22.dp, end = 22.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Payment",
                    color = Color(0xFF909090),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
                Image(
                    painter = painterResource(id = R.drawable.pen), contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(16.dp)
                        .height(19.dp)
                )
            }
            ///Nav box 4
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 32.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .height(68.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .shadow(
                        elevation = 40.dp,
                        spotColor = Color(0x338A959E)
                    )
                    .padding(vertical = 15.dp, horizontal = 20.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(end = 17.dp)
                        .width(64.dp)
                        .height(38.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .shadow(
                            elevation = 25.dp,
                            spotColor = Color(0x12000000)
                        )
                        .padding(0.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mastercard),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(32.dp)
                            .height(32.dp)
                            .padding(top = 7.dp)
                    )
                }
                Text(
                    text = "**** **** **** 3947",
                    color = Color(0xFF232323),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            //Nav 5
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 28.dp, start = 21.dp, end = 21.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Delivery method ",
                    color = Color(0xFF909191),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
                Image(
                    painter = painterResource(id = R.drawable.pen), contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(16.dp)
                        .height(19.dp)
                )
            }
            ///Nav 6
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 56.dp, start = 41.dp, end = 41.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dhl), contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(end = 17.dp)
                        .width(88.dp)
                        .height(19.dp)
                )
                Text(
                    text = "Fast(2-3days)",
                    color = Color(0xFF303030),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth()

                )
            }
            Column(
                modifier = Modifier
                    .padding(bottom = 26.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .shadow(
                        elevation = 40.dp,
                        spotColor = Color(0x338A959E)
                    )
                    .padding(
                        vertical = 19.dp,
                        horizontal = 21.dp
                    )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Order",
                        color = Color(0xFF808080),
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(end = 4.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "\$ 95.00",
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Delivery:",
                        color = Color(0xFF808080),
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(end = 4.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "\$ 5.00",
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Total:",
                        color = Color(0xFF808080),
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(end = 4.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "\$ 100.00",
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

            }
            // Nav 7
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(horizontal = 19.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFF232323),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .shadow(
                        elevation = 20.dp,
                        spotColor = Color(0x40303030)
                    )
                    .padding(vertical = 22.dp)
            ) {
                Text(
                    text = "SUBMIT ORDER",
                    color = Color.White,
                    fontSize = 20.sp, fontWeight = FontWeight.Bold
                )
            }


        }
    }
}

@Composable
fun Footcheckout() {

}