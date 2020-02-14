package xyz.absolutez3ro.championgram.ui.home

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.TopAppBar
import androidx.ui.res.stringResource
import androidx.ui.tooling.preview.Preview
import xyz.absolutez3ro.championgram.R
import xyz.absolutez3ro.championgram.data.champions
import xyz.absolutez3ro.championgram.data.stories
import xyz.absolutez3ro.championgram.model.Champion
import xyz.absolutez3ro.championgram.model.Story

@Composable
fun HomeScreen() {
    Column {
        TopAppBar(title = {
            Align(alignment = Alignment.Center) {
                Text(text = +stringResource(R.string.app_name))
            }
        })
        VerticalScroller(modifier = Flexible(1f)) {
            Column {
                StorySection(stories)
                HomeScreenDivider()
                ChampionSection(champions)
            }
        }
    }
}

@Composable
fun StorySection(stories: List<Story>) {
    HorizontalScroller {
        Row(modifier = Spacing(bottom = 8.dp, top = 8.dp)) {
            stories.forEach { story ->
                WidthSpacer(width = 16.dp)
                HomeStory(story)
            }
        }
    }
}

@Composable
fun ChampionSection(champions: List<Champion>) {
    champions.forEach { champion ->
        HomeChampionCard(champion = champion)
    }
}

@Composable
fun HomeScreenDivider() {
    Opacity(opacity = 0.20f) {
        Divider(
            color = Color.Gray
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}