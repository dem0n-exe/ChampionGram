package xyz.absolutez3ro.championgram.ui

import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.frames.ModelList
import androidx.ui.core.dp
import androidx.ui.foundation.selection.Toggleable
import androidx.ui.graphics.Color
import androidx.ui.layout.Container
import androidx.ui.layout.Size
import androidx.ui.material.ripple.Ripple
import xyz.absolutez3ro.championgram.R

@Composable
fun BookmarkButton(
    isBookmarked: Boolean,
    onBookmark: (Boolean) -> Unit,
    tint: Color = Color.Transparent
) {
    Ripple(
        bounded = false,
        radius = 24.dp
    ) {
        Toggleable(isBookmarked, onBookmark) {
            Container(modifier = Size(48.dp, 48.dp)) {
                if (isBookmarked) {
                    VectorImage(id = R.drawable.ic_baseline_favorite_24, tint = tint)
                } else {
                    VectorImage(id = R.drawable.ic_baseline_favorite_border_24, tint = tint)
                }
            }
        }
    }
}

fun toggleBookmark(championId: Int) {
    with(BookmarkState) {
        if (favorites.contains(championId)) {
            favorites.remove(championId)
        } else {
            favorites.add(championId)
        }
    }
}

fun isFavorite(championId: Int) = BookmarkState.favorites.contains(championId)

@Model
object BookmarkState {
    val favorites = ModelList<Int>()
}