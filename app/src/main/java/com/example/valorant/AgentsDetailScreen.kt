package com.example.valorant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AgentsDetailScreen(
    navController: NavController
){
    Surface(modifier = Modifier.fillMaxSize()) {
        Box() {
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Fade", modifier = Modifier.padding(30.dp).align(CenterHorizontally),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Image(painter = painterResource(id = R.drawable.fade), contentDescription = " ",
                modifier = Modifier.padding(bottom = 20.dp))
                Text(text = "The Way Forward Card",
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 10.dp)
                        .align(CenterHorizontally),
                    fontSize = 15.sp
                )
                Text(text = "Descripiton :- Turkish bounty hunter Fade unleashes the power of raw nightmare to seize enemy secrets. Attuned with terror itself, she hunts down targets and reveals their deepest fears - before crushing them in the dark.",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 30.dp, start = 20.dp, end = 20.dp)
                        .align(CenterHorizontally)
                    , fontSize = 12.sp

                )
            }
        }
    }
}
