package com.example.navigationwitharguments.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import com.example.navigationwitharguments.data.UserData
import com.example.navigationwitharguments.data.listOfUsers

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    userId: Int
) {
    val user: UserData = listOfUsers.find { it.id == userId }!!

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "Detail Screen",
                    fontFamily = FontFamily.Serif)
            })
        }
    ) {paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = user.name,
                fontFamily = FontFamily.Monospace
            )

            Text(
                text = user.email,
                fontFamily = FontFamily.Monospace
            )

            Text(
                text = user.contactNum.toString(),
                fontFamily = FontFamily.Monospace
            )

            Text(
                text = user.homeTown,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}