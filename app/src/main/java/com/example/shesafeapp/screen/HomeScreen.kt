package com.example.shesafeapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f)
            .background(color = MaterialTheme.colorScheme.primary),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "SheSafe",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            ),
            modifier = Modifier.padding(vertical = 5.dp)
        )
        Text(
            text = "We're here for you",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        )


    }
    Row(Modifier.fillMaxSize(), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.Center) {
        Text(
            text = "app made for @karlimsc",
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.secondary
            ),
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }
}