package me.carlossanchez.facebook.j.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PostStats(
    modifier: Modifier = Modifier,
    likesCount: Int = 125,
    commentsCount: Int = 45,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Ícono de reacción "Me gusta" (círculo azul con la mano en blanco)
        Box(
            modifier = Modifier
                .size(18.dp)
                .background(Color(0xFF1877F2), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.ThumbUp,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(10.dp)
            )
        }

        Spacer(modifier = Modifier.width(6.dp))

        // Número de likes a la derecha del ícono
        Text(
            text = "$likesCount",
            fontSize = 13.sp,
            color = Color(0xFF65676B)
        )

        Spacer(modifier = Modifier.weight(1f))

        // Cantidad de comentarios a la derecha del todo
        Text(
            text = "$commentsCount comentarios",
            fontSize = 13.sp,
            color = Color(0xFF65676B)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostStatsPreview() {
    PostStats()
}
