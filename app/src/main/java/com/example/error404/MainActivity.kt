package com.example.error404

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.error404.ui.theme.Error404Theme
import java.lang.Error

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Error404Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    errorMessage(error = "404", message = "Page Not Found")
                }
            }
        }
    }
}

@Composable
fun errorMessage(error: String, message: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = error,
            fontSize = 80.sp
        )
        Text(
            text = message,
            fontSize = 20.sp
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Error404Theme {
       errorMessage(error = "404", message = "Page Not Found")
    }
}