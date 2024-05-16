package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                MainContainer(
                    name = "Android",
                )
            }
        }
    }
}

@Composable
fun CardElement(title: String, description: String, modifier: Modifier = Modifier, color:Int) {

    Column(modifier = modifier
        .fillMaxSize()
        .background(color = colorResource(id = color))
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun MainContainer(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Row( modifier= Modifier.weight(1f)) {
            CardElement(
                title = stringResource(id = R.string.quadrant_title_1),
                description = stringResource(
                    id = R.string.quadrant_description_1
                ),
                modifier = modifier.weight(1f),
                color = R.color.violeta_1
            )
            CardElement(
                title = stringResource(id = R.string.quadrant_title_2),
                description = stringResource(id = R.string.quadrant_description_2),
                modifier = modifier.weight(1f),
                color = R.color.violeta_2
            )
        }
        Row(modifier= Modifier.weight(1f)) {
            CardElement(
                title = stringResource(id = R.string.quadrant_title_3),
                description = stringResource(id = R.string.quadrant_description_3),
                modifier = modifier.weight(1f),
                color = R.color.violeta_3
            )
            CardElement(
                title = stringResource(id = R.string.quadrant_title_4),
                description = stringResource(id = R.string.quadrant_description_4),
                modifier = modifier.weight(1f),
                color = R.color.violeta_4
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        MainContainer("Android")
    }
}