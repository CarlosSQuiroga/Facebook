package me.carlossanchez.facebook.j.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    imageUrl: String = "https://picsum.photos/600/400",
    textContent: String = "por fin termine la pantalla de login en compose"
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        PostHeader()
        Text(
            text = "Porfin terminé la pantalla de login en compose!!",
            modifier = Modifier.padding(horizontal = 12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        AsyncImage(
            model = imageUrl,
            contentDescription = "Imagen de la publicación",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    PostCard()
}
