package com.example.valorant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.valorant.ui.theme.ValorantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.fade)
            val title = "Fade"
            val contentDescription = "Fade"
            Box(modifier = Modifier
                    .padding(horizontal = 100.dp)
                .fillMaxWidth()

            ){
                ImageCard(painter = painter, title = title, contentDescription = contentDescription)

            }


            }
        }
    }


@Composable
fun ImageCard(
painter: Painter,
title: String,
contentDescription: String,
modifier: Modifier = Modifier
) {
    Card(
        //shape = RoundedCornerShape(15.dp),
        //elevation = 5.dp
        modifier = modifier
            .fillMaxWidth()
            .clickable { }



    ) {
        Box(modifier = Modifier.height(200.dp),
                contentAlignment = Alignment.Center) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop


            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(title, style = TextStyle(color = Color.White, fontSize = 20.sp))


            }

        }
    }
}







