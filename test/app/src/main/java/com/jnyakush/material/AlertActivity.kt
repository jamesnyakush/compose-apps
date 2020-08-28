package com.jnyakush.material

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.clickable
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.AlertDialog
import androidx.ui.material.Button
import androidx.ui.material.Card
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.TextUnit
import androidx.ui.unit.dp

class AlertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ClickableText()
        }
    }
}

@Composable
fun ClickableText() {
    var showPopup by state { false }

    Box(modifier = Modifier.clickable(onClick = { showPopup = true }), children = {
        Card(
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.padding(8.dp),
            color = Color.LightGray
        ) {
            Text(
                text = "Click to See Dialog",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(fontSize = TextUnit.Companion.Sp(16)),
                fontFamily = FontFamily.Serif
            )
        }

    })


    val onPopupDismissed = { showPopup = false }

    if (showPopup) {
        AlertDialog(onCloseRequest = onPopupDismissed,
            text = {
                Text("Successfuly Clicked")

            },
            confirmButton = {
                Button(onClick = onPopupDismissed) {
                    Text(text = "Ok")
                }
            }
        )
    }
}

@Preview
@Composable
fun ClickableTextPreview() {
    Column {
        ClickableText()
    }
}