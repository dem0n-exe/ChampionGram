package xyz.absolutez3ro.championgram.ui.story

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Color
import androidx.ui.layout.Align
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import xyz.absolutez3ro.championgram.model.Story

@Composable
fun StoryContent(story: Story) {
    val image = +imageResource(story.imageId)
    DrawImage(image = image)
    Align(alignment = Alignment.BottomCenter) {
        Text(
            text = "Posted by: ${story.champion.madeUpName}",
            modifier = Spacing(16.dp),
            style = (+MaterialTheme.typography()).h2.copy(color = Color.White)
        )
    }
}