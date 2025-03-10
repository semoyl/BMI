package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
    fun UserDataScreen (modifier: Modifier = Modifier){
        var nomeState = remember {
            mutableStateOf(value = "")
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFA045E5))
        ){
            Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(650.dp)
                        .align(Alignment.BottomCenter),
                    shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .padding(top = 50.dp)
                        .height(200.dp),
                    horizontalArrangement = (Arrangement.SpaceBetween)
                ) {
                    Column{
                            Card (
                                shape = CircleShape,
                                modifier = Modifier
                                    .height(150.dp)
                                    .width(150.dp),
                                colors =
                            ) {  }
                    }
                    Column {
                            Card (
                                shape = CircleShape,
                                modifier = Modifier
                                    .height(150.dp)
                                    .width(150.dp)
                            ) {  }
                    }
                }
            }
        }

    }

@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen()
}