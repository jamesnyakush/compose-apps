package com.jnyakush.compose.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.padding
import androidx.ui.layout.preferredHeight
import androidx.ui.layout.preferredWidth
import androidx.ui.material.Card
import androidx.ui.material.ListItem
import androidx.ui.unit.dp
import com.jnyakush.compose.R


class Cardview : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialCardView()
        }

    }
}

@Composable
fun MaterialCardView() {

    val resources = ContextAmbient.current.resources

    Card(shape = RoundedCornerShape(8.dp), modifier = Modifier.padding(8.dp)) {
        ListItem(text = {
            Text(text = "Title")
        }, secondaryText = {
            Text(text = "Sub-Title")
        }, icon = {
            Box(modifier = Modifier.preferredWidth(48.dp) + Modifier.preferredHeight(48.dp)){
                Image(asset = imageFromResource(resources, R.drawable.ic_launcher_background))
            }
        }
        )
    }
}

//@Preview
//@Composable
//fun MaterialCardViewPreview(){
//    MaterialCardView()
//}