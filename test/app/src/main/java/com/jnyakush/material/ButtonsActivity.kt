package com.jnyakush.material

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Border
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.SolidColor
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import kotlinx.coroutines.withContext

class ButtonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            Column(modifier = Modifier.fillMaxSize()) {

                SimpleMaterialButton()
                SimpleButtonWithBorderComponent()
                RoundedCornerButtonComponent()
                OutlinedButtonComponent()
            }
        }
    }
}


@Composable
fun SimpleMaterialButton() {

    Button(
            modifier = Modifier.padding(16.dp),
            elevation = 5.dp,
            onClick = {}
    ) {
        Text(text = "Simple Button", modifier = Modifier.padding(16.dp))
    }

}

@Composable
fun SimpleButtonWithBorderComponent() {
    Button(
            onClick = {},
            modifier = Modifier.padding(16.dp),
            elevation = 5.dp,
            border = Border(size = 5.dp, brush = SolidColor(Color.Black))
    ) {
        Text(text = "Simple Button Border Component", modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun RoundedCornerButtonComponent() {

    Button(
            onClick = {},
            modifier = Modifier.padding(16.dp),
            elevation = 5.dp,
            shape = RoundedCornerShape(16.dp)

    ) {
        Text(text = "Rounded Corner Button", modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun OutlinedButtonComponent(){
    Button(
            onClick = {},
            modifier = Modifier.padding(16.dp)
    ){
        Text(text = "Outlined Button",modifier = Modifier.padding(16.dp))
    }
}

@Preview("Simple Button")
@Composable
fun SimpleMaterialButtonPreview() {
    SimpleMaterialButton()
}

@Preview("Simple Button With Border")
@Composable
fun SimpleButtonWithBorderComponentPreview() {
    SimpleButtonWithBorderComponent()
}

@Preview("RoundedCornerButtonComponent")
@Composable
fun RoundedCornerButtonComponentPreview() {
    RoundedCornerButtonComponent()
}

@Preview("Outlined Button")
@Composable
fun OutlinedButtonComponentPreview(){
    OutlinedButtonComponent()
}