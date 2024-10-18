package com.example.basiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposable.ui.theme.BasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComposable(
                        ijam = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicComposable
            ( ijam: Modifier = Modifier)
{
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Indonesia",
            modifier = ijam,
            fontSize = 70.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Versus",
            style = TextStyle(
                fontSize = 40.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Blue
            )
        )
        Image(
            painter = painterResource(id = R.drawable.fifaaa),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic
            )
        )

    }

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicComposableTheme {
        Greeting("Android")
    }
}