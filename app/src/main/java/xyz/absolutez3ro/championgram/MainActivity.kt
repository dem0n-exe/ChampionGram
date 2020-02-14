package xyz.absolutez3ro.championgram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import xyz.absolutez3ro.championgram.ui.ChampionGramApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ChampionGramApp()
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        ChampionGramApp()
    }
}