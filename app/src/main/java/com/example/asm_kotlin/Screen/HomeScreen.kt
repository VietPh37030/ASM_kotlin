package com.example.asm_kotlin.Screen

import androidx.activity.ComponentActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.asm_kotlin.R

@Composable
fun HomeScreen() {
    PreviewHomeScreen()

}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreenContent()
}

@Composable
fun HomeScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 20.dp)
            // Nền trắng cho màn hình
            .background(
                color = Color.White,
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(top = 18.dp)
                // Nền trắng cho nội dung chính
                .background(
                    color = Color.White,
                )
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 29.dp, start = 22.dp, end = 22.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                )
                Text(
                    text = "Make home\nBEAUTIFUL",
                    color = Color(0xFF232323),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(113.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.cart),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(22.dp)
                        .height(21.dp)

                )
            }//Close header content
            /// category content
            Row(
                modifier = Modifier
                    .padding(bottom = 10.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ) {
                // Thành phần danh sách danh mục
                Box {
                    Column(
                        modifier = Modifier
                            .padding(end = 25.dp)
                            .width(44.dp)
                            .background(
                                color = Color(0xFF303030),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 13.dp)
                            .width(44.dp)
                            .height(44.dp)
                    ) {
                        // Các mục danh mục nằm trong đây
                        Image(
                            painter = painterResource(id = R.drawable.popular),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(top = 13.dp)
                                .height(19.dp)
                                .fillMaxWidth()
                        )
                    }
                    Text(
                        text = "Popular",
                        color = Color(0xFF242424),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 47.dp)
                    )
                }
                ///Category2
                Box {
                    Column(
                        modifier = Modifier
                            .padding(end = 25.dp)
                            .width(44.dp)
                            .background(
                                color = Color(0xFFF5F5F5),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 13.dp)
                            .width(44.dp)
                            .height(44.dp)
                            .border(1.dp, Color.Transparent) // Không có border
                        ,
                        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa theo chiều ngang
                        verticalArrangement = Arrangement.Center // Căn giữa theo chiều dọc
                    ) {
                        // Các mục danh mục nằm trong đây
                        Image(
                            painter = painterResource(id = R.drawable.chair),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(28.dp)
                                .height(20.13.dp)
                                .offset(y = 3.94.dp)
                        )
                    }
                    Text(
                        text = "Chair",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 47.dp, start = 5.dp)
                    )
                }

                ///Category3
                Box {


                    Column(
                        modifier = Modifier
                            .padding(end = 25.dp)
                            .width(44.dp)
                            .background(
                                color = Color(0xFFF5F5F5),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 13.dp)
                            .width(44.dp)
                            .height(44.dp)
                            .border(1.dp, Color.Transparent) // Không có border
                        ,
                        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa theo chiều ngang
                        verticalArrangement = Arrangement.Center // Căn giữa theo chiều dọc
                    ) {
                        // Các mục danh mục nằm trong đây
                        Image(
                            painter = painterResource(id = R.drawable.table),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(28.dp)
                                .height(20.13.dp)
                                .offset(y = 3.94.dp)
                        )
                    }
                    Text(
                        text = "Table",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 47.dp, start = 2.dp)
                    )
                }
                ///Category3
                Box {

                    Column(
                        modifier = Modifier
                            .padding(end = 25.dp)
                            .width(44.dp)
                            .background(
                                color = Color(0xFFF5F5F5),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 13.dp)
                            .width(44.dp)
                            .height(44.dp)
                            .border(1.dp, Color.Transparent) // Không có border
                        ,
                        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa theo chiều ngang
                        verticalArrangement = Arrangement.Center // Căn giữa theo chiều dọc
                    ) {
                        // Các mục danh mục nằm trong đây
                        Image(
                            painter = painterResource(id = R.drawable.table),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(28.dp)
                                .height(20.13.dp)
                                .offset(y = 3.94.dp)
                        )
                    }
                    Text(
                        text = "Table",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 47.dp, start = 2.dp)
                    )
                }
                ///Category4
                Box {


                    Column(
                        modifier = Modifier
                            .padding(end = 25.dp)
                            .width(44.dp)
                            .background(
                                color = Color(0xFFF5F5F5),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 13.dp)
                            .width(44.dp)
                            .height(44.dp)
                            .border(1.dp, Color.Transparent) // Không có border
                        ,
                        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa theo chiều ngang
                        verticalArrangement = Arrangement.Center // Căn giữa theo chiều dọc
                    ) {
                        // Các mục danh mục nằm trong đây
                        Image(
                            painter = painterResource(id = R.drawable.armchair),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(28.dp)
                                .height(20.13.dp)
                                .offset(y = 3.94.dp)
                        )
                    }
                    Text(
                        text = "Armchair",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 47.dp, start = 1.dp)
                    )
                }
                ///Category5
                Box {


                    Column(
                        modifier = Modifier
                            .padding(end = 25.dp)
                            .width(44.dp)
                            .background(
                                color = Color(0xFFF5F5F5),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 13.dp)
                            .width(44.dp)
                            .height(44.dp)
                            .border(1.dp, Color.Transparent) // Không có border
                        ,
                        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa theo chiều ngang
                        verticalArrangement = Arrangement.Center // Căn giữa theo chiều dọc
                    ) {
                        // Các mục danh mục nằm trong đây
                        Image(
                            painter = painterResource(id = R.drawable.bed),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(28.dp)
                                .height(20.13.dp)
                                .offset(y = 3.94.dp)
                        )
                    }
                    Text(
                        text = "Bed",
                        color = Color(0xFF999999),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 47.dp, start = 11.dp)
                    )
                }

            }
            /// Close category content
            ProductList()
        }
    }

    /// Product conte

}

@Composable
fun ProductList(navController: NavController? = null) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = 15.dp, start = 20.dp, end = 20.dp)
            .fillMaxWidth()
    ) {
        Column ( modifier = Modifier.padding(top = 10.dp, start = 10.dp), // Thêm padding và điều chỉnh vị trí
            verticalArrangement = Arrangement.Center)
        {

        Box(
            modifier = Modifier
                .width(157.dp)
                .fillMaxHeight()
                .padding(end = 10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.den),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(157.dp)
                    .height(200.dp) .clip(RoundedCornerShape(8.dp)) // Áp dụng radius cho ảnh
            )
            /// lớp bọc cái bag
            Box(modifier = Modifier.padding(start = 110.dp)) {
                Column(
                    modifier = Modifier
                        .padding(top = 160.dp)
                        .width(30.dp)
                        .height(30.dp)
                        .background(
                            color = Color(0x665F5F5F),
                            shape = RoundedCornerShape(bottomStart = 6.dp)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bag),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(8.dp)
                            .height(15.dp)
                            .width(16.dp)
                    )
                }
            }

            /// close lớp bọc cái bag
            Column(
                modifier = Modifier.padding(top = 205.dp), // Thêm padding và điều chỉnh vị trí
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Black Simple Lamp",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "\$ 12.00",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W700,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }

        }
        Column ( modifier = Modifier.padding(top = 10.dp, start = 10.dp), // Thêm padding và điều chỉnh vị trí
            verticalArrangement = Arrangement.Center){
            Box(
                modifier = Modifier
                    .width(157.dp)
                    .fillMaxHeight()
                    .padding(end = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.table1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(157.dp)
                        .height(200.dp) .clip(RoundedCornerShape(8.dp)) // Áp dụng radius cho ảnh
                )
                /// lớp bọc cái bag
                Box(modifier = Modifier.padding(start = 110.dp)) {
                    Column(
                        modifier = Modifier
                            .padding(top = 160.dp)
                            .width(30.dp)
                            .height(30.dp)
                            .background(
                                color = Color(0x665F5F5F),
                                shape = RoundedCornerShape(bottomStart = 6.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bag),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(8.dp)
                                .height(15.dp)
                                .width(16.dp)
                        )
                    }
                }

                /// close lớp bọc cái bag
                Column(
                    modifier = Modifier.padding(top = 205.dp), // Thêm padding và điều chỉnh vị trí
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Minimal Stand",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    Text(
                        text = "\$ 25.00",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W700,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                }
            }

        }
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = 15.dp, start = 20.dp, end = 20.dp)
            .fillMaxWidth()
    ) {
        Column ( modifier = Modifier.padding(top = 10.dp, start = 10.dp), // Thêm padding và điều chỉnh vị trí
            verticalArrangement = Arrangement.Center){
            Box(
                modifier = Modifier
                    .width(157.dp)
                    .fillMaxHeight()
                    .padding(end = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.chairone),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(157.dp)
                        .height(200.dp) .clip(RoundedCornerShape(8.dp)) // Áp dụng radius cho ảnh
                )
                /// lớp bọc cái bag
                Box(modifier = Modifier.padding(start = 110.dp)) {
                    Column(
                        modifier = Modifier
                            .padding(top = 160.dp)
                            .width(30.dp)
                            .height(30.dp)
                            .background(
                                color = Color(0x665F5F5F),
                                shape = RoundedCornerShape(bottomStart = 6.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bag),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(8.dp)
                                .height(15.dp)
                                .width(16.dp)
                        )
                    }
                }

                /// close lớp bọc cái bag
                Column(
                    modifier = Modifier.padding(top = 205.dp), // Thêm padding và điều chỉnh vị trí
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Coffee Chair",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    Text(
                        text = "\$ 20.00",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W700,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                }
            }

        }
        Column ( modifier = Modifier.padding(top = 10.dp, start = 10.dp), // Thêm padding và điều chỉnh vị trí
            verticalArrangement = Arrangement.Center){
            Box(
                modifier = Modifier
                    .width(157.dp)
                    .fillMaxHeight()
                    .padding(end = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.deskone),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(157.dp)
                        .height(200.dp) .clip(RoundedCornerShape(8.dp)) // Áp dụng radius cho ảnh
                )
                /// lớp bọc cái bag
                Box(modifier = Modifier.padding(start = 110.dp)) {
                    Column(
                        modifier = Modifier
                            .padding(top = 160.dp)
                            .width(30.dp)
                            .height(30.dp)
                            .background(
                                color = Color(0x665F5F5F),
                                shape = RoundedCornerShape(bottomStart = 6.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bag),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(8.dp)
                                .height(15.dp)
                                .width(16.dp)
                        )
                    }
                }

                /// close lớp bọc cái bag
                Column(
                    modifier = Modifier.padding(top = 205.dp), // Thêm padding và điều chỉnh vị trí
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Simple Desk",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    Text(
                        text = "\$ 50.00",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W700,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                }
            }

        }
    }
}
