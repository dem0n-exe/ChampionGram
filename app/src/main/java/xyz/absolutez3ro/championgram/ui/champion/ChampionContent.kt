package xyz.absolutez3ro.championgram.ui.champion

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.font.FontStyle
import androidx.ui.tooling.preview.Preview
import xyz.absolutez3ro.championgram.data.spiderman
import xyz.absolutez3ro.championgram.model.Champion

@Composable
fun ChampionContent(modifier: Modifier = Modifier.None, champion: Champion) {
    VerticalScroller(modifier = modifier) {
        Column {
            HeaderImage(champion = champion)
            Column(modifier = Spacing(left = 16.dp, right = 16.dp)) {
                HeightSpacer(height = 16.dp)
                MadeupName(text = champion.madeUpName)
                Row {
                    HeaderTextKey(text = "Name: ")
                    HeaderTextValue(text = champion.name)
                }
                HeightSpacer(height = 16.dp)
                Row {
                    HeaderTextKey(text = "Place of origin: ")
                    HeaderTextValue(text = champion.placeOfOrigin)
                }
                HeightSpacer(height = 16.dp)
                HeaderTextKey(text = "Abilities:")
                HeightSpacer(height = 8.dp)
                BulletText(listOfText = champion.abilities)
            }
        }
    }
}

@Composable
fun HeaderImage(champion: Champion) {
    val image = +imageResource(champion.imageId)
    Container(modifier = MinHeight(280.dp) wraps ExpandedWidth) {
        DrawImage(image = image)
    }
}

@Composable
fun MadeupName(text: String) {
    Text(text = text, style = (+MaterialTheme.typography()).h3)
}

@Composable
fun HeaderTextKey(text: String) {
    Text(text = text, style = (+MaterialTheme.typography()).h5)
}

@Composable
fun HeaderTextValue(text: String) {
    Text(
        text = text,
        style = (+MaterialTheme.typography()).h5.withOpacity(0.8f).copy(fontStyle = FontStyle.Italic)
    )
}

@Composable
fun BulletText(listOfText: List<String>) {
    listOfText.forEach { text ->
        Text(text = "• $text", style = (+MaterialTheme.typography()).body1)
    }
}

@Preview
@Composable
fun ChampionContentPreview() {
    ChampionContent(champion = spiderman)
}

