package com.example.ejercicio_piano

import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.ejercicio_piano.ui.theme.Ejercicio_PianoTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        enableEdgeToEdge()
        setContent {
            Ejercicio_PianoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Piano()
}

private fun reproducirSonido(context: android.content.Context, soundResId: Int) {
    val mediaPlayer = MediaPlayer.create(context, soundResId)
    mediaPlayer.setOnCompletionListener { it.release() }
    mediaPlayer.start()



}


@Composable
fun Piano(){

    val context = LocalContext.current

    var primerColor by remember { mutableStateOf(Color.Transparent) }
    var primerColor2_0 by remember { mutableStateOf(Color.Transparent) }

    var segundoColor by remember { mutableStateOf(Color.Transparent) }
    var segundoColor2_0 by remember { mutableStateOf(Color.Transparent) }

    var tercerColor by remember { mutableStateOf(Color.Transparent) }
    var tercerColor2_0 by remember { mutableStateOf(Color.Transparent) }

    var cuartoColor by remember { mutableStateOf(Color.Transparent) }
    var cuartoColor2_0 by remember { mutableStateOf(Color.Transparent) }

    var quintoColor by remember { mutableStateOf(Color.Transparent) }
    var quintoColor2_0 by remember { mutableStateOf(Color.Transparent) }

    var sextoColor by remember { mutableStateOf(Color.Transparent) }
    var sextoColor2_0 by remember { mutableStateOf(Color.Transparent) }

    var septimoColor by remember { mutableStateOf(Color.Transparent) }
    var septimoColor2_0 by remember { mutableStateOf(Color.Transparent) }


    val coroutineScope = rememberCoroutineScope()

    Row(modifier = Modifier
        .fillMaxSize()) {


        Column(modifier = Modifier
            .fillMaxHeight()
            .background(color = Color.LightGray)
            .padding(30.dp)
        )  {

            Box(Modifier
                .width(225.dp)
                .weight(1f)
                .border(width = 10.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.White)
                .clickable {
                    reproducirSonido(context, R.raw.doo)

                    coroutineScope.launch {
                        primerColor = Color.Blue
                        delay(250)
                        primerColor = Color.Transparent
                    }


                } )  {}

            Box(Modifier
                .width(150.dp)
                .align(Alignment.End)
                .weight(0.5f)
                .border(width = 5.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.Black)
                .clickable {
                    reproducirSonido(context, R.raw.a4)

                    coroutineScope.launch {
                        primerColor2_0 = Color.Cyan
                        delay(250)
                        primerColor2_0 = Color.Transparent
                    }


                } )  {}

            Box(Modifier
                .width(225.dp)
                .weight(1f)
                .border(width = 10.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.White)
                .clickable {
                    reproducirSonido(context, R.raw.re)

                    coroutineScope.launch {
                        segundoColor = Color.Blue
                        delay(250)
                        segundoColor = Color.Transparent
                    }} ){}

            Box(Modifier
                .width(150.dp)
                .align(Alignment.End)
                .weight(0.5f)
                .border(width = 5.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.Black)
                .clickable {
                    reproducirSonido(context, R.raw.b4)

                    coroutineScope.launch {
                        segundoColor2_0 = Color.Cyan
                        delay(250)
                        segundoColor2_0 = Color.Transparent
                    }


                } )  {}

            Box(Modifier
                .width(225.dp)
                .weight(1f)
                .border(width = 10.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.White)
                .clickable {
                    reproducirSonido(context, R.raw.mi)

                    coroutineScope.launch {
                        tercerColor = Color.Blue
                        delay(250)
                        tercerColor = Color.Transparent
                    }} ){}

            Box(Modifier
                .width(150.dp)
                .align(Alignment.End)
                .weight(0.5f)
                .border(width = 5.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.Black)
                .clickable {
                    reproducirSonido(context, R.raw.c4)

                    coroutineScope.launch {
                        tercerColor2_0 = Color.Cyan
                        delay(250)
                        tercerColor2_0 = Color.Transparent
                    }


                } )  {}

            Box(Modifier
                .width(225.dp)
                .weight(1f)
                .border(width = 10.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.White)
                .clickable {
                    reproducirSonido(context, R.raw.fa)

                    coroutineScope.launch {
                        cuartoColor = Color.Blue
                        delay(250)
                        cuartoColor = Color.Transparent
                    }} ){}

            Box(Modifier
                .width(150.dp)
                .align(Alignment.End)
                .weight(0.5f)
                .border(width = 5.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.Black)
                .clickable {
                    reproducirSonido(context, R.raw.d4)

                    coroutineScope.launch {
                        cuartoColor2_0 = Color.Cyan
                        delay(250)
                        cuartoColor2_0 = Color.Transparent
                    }


                } )  {}

            Box(Modifier
                .width(225.dp)
                .weight(1f)
                .border(width = 10.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.White)
                .clickable {
                    reproducirSonido(context, R.raw.sol)

                    coroutineScope.launch {
                        quintoColor = Color.Blue
                        delay(250)
                        quintoColor = Color.Transparent
                    }} ){}

            Box(Modifier
                .width(150.dp)
                .align(Alignment.End)
                .weight(0.5f)
                .border(width = 5.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.Black)
                .clickable {
                    reproducirSonido(context, R.raw.e4)

                    coroutineScope.launch {
                        quintoColor2_0 = Color.Cyan
                        delay(250)
                        quintoColor2_0 = Color.Transparent
                    }


                } )  {}

            Box(Modifier
                .width(225.dp)
                .weight(1f)
                .border(width = 10.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.White)
                .clickable {
                    reproducirSonido(context, R.raw.la)

                    coroutineScope.launch {
                        sextoColor = Color.Blue
                        delay(250)
                        sextoColor = Color.Transparent
                    }} ){}

            Box(Modifier
                .width(150.dp)
                .align(Alignment.End)
                .weight(0.5f)
                .border(width = 5.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.Black)
                .clickable {
                    reproducirSonido(context, R.raw.f4)

                    coroutineScope.launch {
                        sextoColor2_0 = Color.Cyan
                        delay(250)
                        sextoColor2_0 = Color.Transparent
                    }


                } )  {}

            Box(Modifier
                .width(225.dp)
                .weight(1f)
                .border(width = 10.dp, color = Color.Black )
                .padding(2.dp)
                .background(color = Color.White)
                .clickable {
                    reproducirSonido(context, R.raw.si)

                    coroutineScope.launch {
                        septimoColor = Color.Blue
                        delay(250)
                        septimoColor = Color.Transparent
                    }} ){}




        }

        //---------------------------------------------------------


        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(30.dp)
        )  {

            Box(Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(2.dp)
                .background(color = primerColor))  {}

            Box(Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(2.dp)
                .background(color = primerColor2_0))  {}

            Box(Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(2.dp)
                .background(color = segundoColor) ){}

            Box(Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(2.dp)
                .background(color = segundoColor2_0))  {}

            Box(Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(2.dp)
                .background(color = tercerColor) ){}

            Box(Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(2.dp)
                .background(color = tercerColor2_0))  {}

            Box(Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(2.dp)
                .background(color = cuartoColor) ){}

            Box(Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(2.dp)
                .background(color = cuartoColor2_0))  {}

            Box(Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(2.dp)
                .background(color = quintoColor) ){}

            Box(Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(2.dp)
                .background(color = quintoColor2_0))  {}

            Box(Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(2.dp)
                .background(color = sextoColor) ){}

            Box(Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(2.dp)
                .background(color = sextoColor2_0))  {}

            Box(Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(2.dp)
                .background(color = septimoColor) ){}




        }




    }







}