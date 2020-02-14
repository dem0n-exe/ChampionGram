package xyz.absolutez3ro.championgram.ui.home

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Card
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.font.FontStyle
import androidx.ui.tooling.preview.Preview
import xyz.absolutez3ro.championgram.data.spiderman
import xyz.absolutez3ro.championgram.model.Champion
import xyz.absolutez3ro.championgram.ui.Screen
import xyz.absolutez3ro.championgram.ui.navigateTo

@Composable
fun HomeChampionCard(champion: Champion) {
    val image = +imageResource(champion.imageId)

    Card(shape = RoundedCornerShape(12.dp), modifier = Spacing(8.dp)) {
        Ripple(bounded = true) {
            Clickable(onClick = {
                navigateTo(Screen.Profile(championId = champion.id))
            }) {
                Column {
                    Container(modifier = ExpandedWidth wraps Size(0.dp, 280.dp)) {
                        DrawImage(image = image)
                    }
                    Column(modifier = Spacing(left = 8.dp, bottom = 8.dp)) {
                        Text(
                            text = champion.name,
                            style = (+MaterialTheme.typography()).h4.withOpacity(0.70f)
                        )
                        Text(
                            text = "\"${champion.madeUpName}\"",
                            style = (+MaterialTheme.typography()).h6.copy(fontStyle = FontStyle.Italic).withOpacity(
                                0.60f
                            )
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeChampionPreview() {
    HomeChampionCard(champion = spiderman)
}