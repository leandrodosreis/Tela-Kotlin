package com.example.composelayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composelayouts.ui.theme.ComposeLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLayoutsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    LayoutScreen(modifier = Modifier
                        .padding(innerPadding)
                    )

//                    Box(modifier = Modifier
//                        .padding(innerPadding)
//                        .background(color = Color.Blue)
//                        .size(
//                            width = 200.dp,
//                            height = 300.dp
//                        ),
//                        contentAlignment = Alignment.TopCenter){
//                        Text("Aula android")
//                        Text("Com Jetpack Compose",
//                            modifier = Modifier.align(Alignment.BottomCenter))
//                    }
                }
            }
        }
    }
}

@Composable
fun LayoutScreen (modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.background(Color.Red).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column( Modifier.background(Color.Blue)
            .weight(1f)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            ) {

            Text("123")
            Text("456")
            Text("789")
        }

        Row( Modifier.background(Color.Cyan)
            .weight(1f)
            .fillMaxWidth(),
            Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {

            Text("123")
            Text("456")
            Text("789")
        }

    }

}