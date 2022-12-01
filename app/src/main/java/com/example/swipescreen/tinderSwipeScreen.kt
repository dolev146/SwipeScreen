package com.example.swipescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp

@Composable
fun tinderSwipeScreen() {
    // A surface container using the 'background' color from the theme
    Surface(color = MaterialTheme.colors.background) {
        Column() {
            TopBar()
            PoliticalAppIconTop()
            HeroCard()
        }


    }
}

@Composable
fun HeroCard(modifier: Modifier = Modifier) {
    Card() {
        
    }
}


@Composable
fun PoliticalAppIconTop(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.political_icon_image), contentDescription = "Political App Icon",
            modifier = Modifier
                .padding(16.dp)
                .size(100.dp)
        )
        // i tried to add the icon as vector but it didn't work
    }
}

@Composable
fun TopBar(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Back",
            tint = Color.Black,
            modifier = Modifier
                .size(40.dp)
                .padding(start = 5.dp)
        )
    }
}