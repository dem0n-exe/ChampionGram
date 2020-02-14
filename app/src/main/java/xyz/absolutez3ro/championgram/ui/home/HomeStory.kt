package xyz.absolutez3ro.championgram.ui.home

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.border.Border
import androidx.ui.foundation.shape.border.DrawBorder
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import xyz.absolutez3ro.championgram.data.spidermanStory
import xyz.absolutez3ro.championgram.model.Story
import xyz.absolutez3ro.championgram.model.StoryStatus
import xyz.absolutez3ro.championgram.ui.Screen
import xyz.absolutez3ro.championgram.ui.navigateTo

@Composable
fun HomeStory(story: Story) {
    val image = +imageResource(story.champion.imageThumbId)

    Ripple(bounded = true) {
        Clickable(onClick = {
            navigateTo(Screen.Story(storyId = story.id))
            story.status = StoryStatus.SEEN
        }) {
            Container(modifier = Size(96.dp, 116.dp)) {
                Column(modifier = Expanded) {
                    Container(modifier = Size(96.dp, 96.dp)) {
                        Clip(shape = CircleShape) {
                            DrawImage(image = image)
                            if (story.status == StoryStatus.NEW)
                                DrawBorder(shape = CircleShape, border = Border(Color.Cyan, 4.dp))
                        }
                    }
                    Align(alignment = Alignment.BottomCenter) {
                        if (story.status == StoryStatus.NEW)
                            Text(
                                text = story.champion.madeUpName,
                                style = ((+MaterialTheme.typography()).body1),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        else
                            Text(
                                text = story.champion.madeUpName,
                                style = ((+MaterialTheme.typography()).body1).withOpacity(0.50f),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun StoryPreview() {
    HomeStory(spidermanStory)
}