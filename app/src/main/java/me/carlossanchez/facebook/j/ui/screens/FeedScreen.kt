package me.carlossanchez.facebook.j.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.carlossanchez.facebook.j.ui.components.StoriesSection

@Preview(showSystemUi = true)
@Composable
fun FeedScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        StoriesSection()
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Text(
                text = "AQUI IRA EL FEED",
                fontSize = 30.sp
            )
        }
    }
}
