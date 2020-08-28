package com.jnyakush.material

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.BottomNavigation
import androidx.ui.material.BottomNavigationItem
import androidx.ui.material.Card
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Home
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            Column() {
                Card(shape = RoundedCornerShape(8.dp),modifier = Modifier.padding(8.dp)) {

                    BottomNavigationAlwaysShowLabelComponent()
                }
            }
        }
    }
}

var menuItem = listOf("Home", "About", "Contacts", "Settings")


@Composable
fun BottomNavigationAlwaysShowLabelComponent() {

    var selectedIndex by state { 0 }

    BottomNavigation(modifier = Modifier.padding(16.dp)) {
        menuItem.forEachIndexed { index, label ->
            BottomNavigationItem(icon = {
                Icon(asset = Icons.Filled.Home)

            },
                text = {
                    Text(text = label)
                },
                selected = selectedIndex == index,
                onSelected = { selectedIndex = index })
        }

    }
}

@Preview
@Composable
fun BottomNavigationAlwaysShowLabelPreview() {
    BottomNavigationAlwaysShowLabelComponent()
}