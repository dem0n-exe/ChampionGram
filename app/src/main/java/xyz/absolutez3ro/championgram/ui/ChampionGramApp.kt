package xyz.absolutez3ro.championgram.ui

import androidx.compose.Composable
import androidx.ui.animation.Crossfade
import androidx.ui.material.MaterialTheme
import xyz.absolutez3ro.championgram.ui.home.HomeScreen

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
            // TODO(Add Story screen)
            // TODO(Add Profile screen)
        }
    }
}