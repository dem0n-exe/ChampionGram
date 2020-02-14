package xyz.absolutez3ro.championgram.ui.champion

import android.content.Context
import android.content.Intent
import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Surface
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import xyz.absolutez3ro.championgram.R
import xyz.absolutez3ro.championgram.data.champions
import xyz.absolutez3ro.championgram.data.spiderman
import xyz.absolutez3ro.championgram.model.Champion
import xyz.absolutez3ro.championgram.ui.*

@Composable
fun ChampionScreen(championId: Int) {
    val champion = champions.find { it.id == championId }!!
    Column {
        TopAppBar(
            title = {
                Text(
                    text = "Champion Profile: ${champion.madeUpName}",
                    style = (+MaterialTheme.typography()).h6.copy(color = Color.White)
                )
            },
            navigationIcon = {
                VectorImageButton(
                    vectorId = R.drawable.ic_baseline_arrow_back_24,
                    tint = Color.White,
                    onClick = { navigateTo(Screen.Home) })
            }
        )
        ChampionContent(modifier = Flexible(1f), champion = champion)
        BottomActionsBar(champion = champion)
    }
}

@Composable
fun BottomActionsBar(champion: Champion) {
    val context = +ambient(ContextAmbient)
    Surface(elevation = 2.dp) {
        Container(modifier = Height(56.dp) wraps Expanded) {
            Row {
                BookmarkButton(
                    isBookmarked = isFavorite(champion.id),
                    onBookmark = { toggleBookmark(champion.id) },
                    tint = Color.Red
                )
                BottomActionButton(vectorId = R.drawable.ic_baseline_share_24, tint = Color.Red) {
                    share(champion, context)
                }
            }
        }
    }
}

@Composable
fun BottomActionButton(
    @DrawableRes vectorId: Int,
    tint: Color = Color.Transparent,
    onClick: () -> Unit
) {
    Ripple(bounded = true) {
        Clickable(onClick = onClick) {
            Container(modifier = Spacing(12.dp) wraps Size(24.dp, 24.dp)) {
                DrawVector(vectorImage = +vectorResource(vectorId), tintColor = tint)
            }
        }
    }
}

private fun share(champion: Champion, context: Context) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TITLE, champion.madeUpName)
        putExtra(Intent.EXTRA_TEXT, champion.url)
    }
    context.startActivity(Intent.createChooser(intent, "Share Champion"))
}

@Preview
@Composable
fun ChampionScreenPreview() {
    ChampionScreen(championId = spiderman.id)
}