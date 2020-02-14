package xyz.absolutez3ro.championgram.ui

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Modifier
import androidx.ui.core.WithDensity
import androidx.ui.foundation.Clickable
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.Container
import androidx.ui.layout.Size
import androidx.ui.material.ripple.Ripple
import androidx.ui.res.vectorResource

@Composable
fun VectorImageButton(
    modifier: Modifier = Modifier.None,
    @DrawableRes vectorId: Int, tint: Color = Color.Transparent,
    onClick: () -> Unit
) {
    Ripple(bounded = false) {
        Clickable(onClick = onClick) {
            VectorImage(modifier = modifier, id = vectorId, tint = tint)
        }
    }
}

@Composable
fun VectorImage(
    modifier: Modifier = Modifier.None, @DrawableRes id: Int,
    tint: Color = Color.Transparent
) {
    val vector = +vectorResource(id)
    WithDensity {
        Container(
            modifier = modifier wraps Size(
                vector.defaultWidth.toDp(),
                vector.defaultHeight.toDp()
            )
        ) {
            DrawVector(vectorImage = vector, tintColor = tint)
        }
    }
}