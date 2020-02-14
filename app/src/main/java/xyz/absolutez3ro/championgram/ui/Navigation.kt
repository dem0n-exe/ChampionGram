package xyz.absolutez3ro.championgram.ui

import androidx.compose.Model

@Model
object Navigation {
    var currentScreen: Screen = Screen.Home
}

fun navigateTo(destination: Screen) {
    Navigation.currentScreen = destination
}

sealed class Screen {
    object Home : Screen()
    data class Profile(val championId: Int) : Screen()
    data class Story(val storyId: Int) : Screen()
}