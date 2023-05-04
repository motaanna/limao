package com.example.limo

import android.graphics.Color.blue
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.limo.ui.theme.LimãoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LimãoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                Limonada()
                }
            }
        }
    }
}
@Preview
@Composable 
fun Limonada() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),

    ) {


        Text(
            text = stringResource(R.string.limoeiro),
            textAlign = TextAlign.Center,
            fontSize = 19.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 13.dp)

        )
         Image(
             painter = painterResource(id = R.drawable.lemon_tree) ,
             contentDescription = null,
             modifier = Modifier
                 .size(250.dp)
                 .border(
                     BorderStroke(3.dp, color = Color.Black),
                     RoundedCornerShape(9.dp)
                 )
         )

    }
}

