package com.mrtckr.livecoding2.ui.compose.util

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF7FC7D9),
    onPrimary = DarkGray,
    secondary = Color(0xFFDCF2F1),
    onSecondary = Color(0xFF4CAF50),
    tertiary = Color(0xFF54A8B4),
    onTertiary = Color.Black,
    surface = Color.White,
    background = DarkGray,
    onSurface = Color(0x992787AF),
)

@Composable
fun MyAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography(),
        shapes = Shapes(),
        content = content
    )
}
