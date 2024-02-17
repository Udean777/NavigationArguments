package com.example.navigationwitharguments.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import com.example.navigationwitharguments.data.listOfUsers

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(onClick: (Int) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = { 
                Text(
                    text = "List Screen",
                    fontFamily = FontFamily.Serif
                                                                      )
            })
        }
    ) {paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ){
            items(
                items = listOfUsers,
                key = {it.id}
            ){user ->
                UserCard(
                    userData = user,
                    onClick = {onClick(user.id)}
                )
            }
        }
    }
}