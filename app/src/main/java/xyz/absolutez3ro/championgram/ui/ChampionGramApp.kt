package xyz.absolutez3ro.championgram.ui

import androidx.compose.Composable
import androidx.ui.animation.Crossfade
import androidx.ui.material.MaterialTheme
import xyz.absolutez3ro.championgram.ui.champion.ChampionScreen
import xyz.absolutez3ro.championgram.ui.home.HomeScreen
import xyz.absolutez3ro.championgram.ui.story.StoryScreen

@Composable
fun ChampionGramApp() {
    MaterialTheme(colors = lightThemeColors) {
        MainScreen()
    }
}

@Composable
fun MainScreen() {
    Crossfade(current = Navigation.currentScreen) { screen ->
        when (screen) {
            is Screen.Home -> HomeScreen()
            is Screen.Story -> StoryScreen(storyId = screen.storyId)
            is Screen.Profile -> ChampionScreen(championId = screen.championId)
        }
    }
}