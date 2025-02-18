package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun TelaInicial(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFFA045E5), Color(0xFF590CFC)
                    )
                )
            ), contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier
                    .padding(top = 50.dp)
            )
            Text(
                text = stringResource(R.string.welcome),
                fontSize = 40.sp,
                color = Color.White
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp), shape = RoundedCornerShape(
                    topStart = 32.dp, topEnd = 32.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = stringResource(R.string.your_name),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .padding(start = 20.dp, top = 10.dp)
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            label = {
                                Text(text = stringResource(R.string.your_name_here))
                            }
                        )

                        }
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(12.dp),

                        ) {
                        Text(
                            text = stringResource(R.string.next)
                        )
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = ""
                        )
                    }

                }

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()
}