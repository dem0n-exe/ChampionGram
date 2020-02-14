package xyz.absolutez3ro.championgram.ui.story

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Align
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import xyz.absolutez3ro.championgram.R
import xyz.absolutez3ro.championgram.data.spidermanStory
import xyz.absolutez3ro.championgram.data.stories
import xyz.absolutez3ro.championgram.ui.Screen
import xyz.absolutez3ro.championgram.ui.VectorImageButton
import xyz.absolutez3ro.championgram.ui.navigateTo

@Composable
fun StoryScreen(storyId: Int) {
    val story = stories.find { it.id == storyId }!!
    Column {
        Container(modifier = Flexible(1f)) {
            StoryContent(story = story)
        }
    }
    Align(alignment = Alignment.TopLeft) {
        VectorImageButton(
            modifier = Spacing(16.dp),
            vectorId = R.drawable.ic_baseline_arrow_back_24,
            tint = Color.White,
            onClick = { navigateTo(Screen.Home) })
    }
    Align(alignment = Alignment.TopCenter) {
        Text(
            text = story.champion.madeUpName,
            modifier = Spacing(16.dp),
            style = (+MaterialTheme.typography()).h6.copy(color = Color.White)
        )
    }
}

@Preview
@Composable
fun StoryScreenPreview() {
    StoryScreen(spidermanStory.id)
}