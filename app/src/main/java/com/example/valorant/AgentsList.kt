package com.example.valorant

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun AgentsList(
    navController: NavController
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(modifier = Modifier.fillMaxSize()
            .padding(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier)
            Image(
                painter = painterResource(id = R.drawable.title),
                contentDescription = "Agents",
            )
        }
        LazyColumn(modifier = Modifier.padding(top = 80.dp) ){
            items(20) {
                Row() {
                    Column(modifier = Modifier.fillMaxWidth()
                        .clickable {
                                  navController.navigate("agentsdetail")
                        },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painter = painterResource(id = R.drawable.fade),
                            contentDescription = "Fade",
                            modifier = Modifier
                                .size(120.dp)
                                .align(Alignment.CenterHorizontally)
                        )
                        Text(
                            text = "Fade",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                        )
                    }
                }
            }
        }

    }
}
