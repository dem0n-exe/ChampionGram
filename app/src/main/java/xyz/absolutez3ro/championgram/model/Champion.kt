package xyz.absolutez3ro.championgram.model

import androidx.compose.Model


data class Champion(
    val id: Int,
    val name: String,
    val madeUpName: String,
    val imageId: Int,
    val imageThumbId: Int,
    val placeOfOrigin: String,
    val abilities: List<String>,
    val url: String
)

@Model
data class Story(
    val id: Int,
    val champion: Champion,
    val imageId: Int,
    var status: StoryStatus = StoryStatus.NEW
)

enum class StoryStatus {
    SEEN,
    NEW
}