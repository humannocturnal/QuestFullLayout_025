package com.example.composablelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.enableSavedStateHandles
import com.example.composablelayout.ui.theme.ComposableLayoutTheme

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppjetpackTheme {
                Scarfold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(

                        Ryan = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(Ryan: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(text = "STARK INDUSTRIES", modifier = Ryan,
            fontSize = 60.sp,
            color = Color.Red,
            forntWeight = FontWeight.Bold
        )
        Text(text = "Consulting in the Future",
            FontSize = 50.sp,
            Color = Color.Blue,
            FontWeight = FontWeight.Medium
            )
        Image(
            painter = painterResource(id = R.drawable.sampel ),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )

        Text(
            text = "Nama",
            fontSize = 30.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Ryan syaputra maulana arsad",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Text(text = "20220140025",
            fontSize = 25.sp,
            color = Color.Black,
            FontWeight = FontWeight.Bold
        )

        Image(
            painter = painterResource(id = R.drawable. pfp),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
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
    ComposableLayoutTheme {
        Greeting("Android")
    }
}