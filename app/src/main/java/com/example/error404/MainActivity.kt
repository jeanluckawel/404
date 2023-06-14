package com.example.error404

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.error404.ui.theme.Error404Theme

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
            fontSize = 150.sp,
            style = MaterialTheme.typography.bodyLarge,
            color = Color (63,123,255)



        )
        Text(
            text = message,
            fontSize = 30.sp,
            style = MaterialTheme.typography.bodyLarge ,
            modifier = Modifier.padding(bottom = 500.dp)

        )
    }
    Errobutton()
    ErrorImage()
}

@Composable
fun Errobutton(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,){
        Button(
            {}, Modifier.padding(80.dp), shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color (63,123,255))
        ) {
            Text(text = "GO HOME.",
                color = Color.White

            )
        }
    }
}
@Composable
fun ErrorImage(){
    val img = painterResource(R.drawable.rr)
    Column(modifier = Modifier.fillMaxSize().padding(top = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier){
            Image(painter = img, contentDescription = null )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Error404Theme {
       errorMessage(error = "404", message = "Page Not Found")
    }
}