package com.codenytra.amme.noterex.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF006D3F),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF8BDA9E),
    onPrimaryContainer = Color(0xFF00391D),
    secondary = Color(0xFF4E6354),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFD0E8D4),
    onSecondaryContainer = Color(0xFF0B1F13),
    tertiary = Color(0xFF3A656F),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFBDEAF5),
    onTertiaryContainer = Color(0xFF001F26),
    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFF5FBF5),
    onBackground = Color(0xFF171D19),
    surface = Color(0xFFF5FBF5),
    onSurface = Color(0xFF171D19),
    surfaceVariant = Color(0xFFDCE5DC),
    onSurfaceVariant = Color(0xFF404943),
    outline = Color(0xFF707972),
    outlineVariant = Color(0xFFC0C9C1),
    scrim = Color(0xFF000000),
    inverseSurface = Color(0xFF2C322D),
    inverseOnSurface = Color(0xFFEDF2EB),
    inversePrimary = Color(0xFF72DB96),
    surfaceDim = Color(0xFFD5DBD5),
    surfaceBright = Color(0xFFF5FBF5),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFEFF5EF),
    surfaceContainer = Color(0xFFE9F0E9),
    surfaceContainerHigh = Color(0xFFE3EAE3),
    surfaceContainerHighest = Color(0xFFDEE4DE),
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF72DB96),
    onPrimary = Color(0xFF00391D),
    primaryContainer = Color(0xFF00522C),
    onPrimaryContainer = Color(0xFF8BDA9E),
    secondary = Color(0xFFB4CCB9),
    onSecondary = Color(0xFF203526),
    secondaryContainer = Color(0xFF374B3C),
    onSecondaryContainer = Color(0xFFD0E8D4),
    tertiary = Color(0xFFA2CDD9),
    onTertiary = Color(0xFF023640),
    tertiaryContainer = Color(0xFF204D57),
    onTertiaryContainer = Color(0xFFBDEAF5),
    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF0F1511),
    onBackground = Color(0xFFDFE4DD),
    surface = Color(0xFF0F1511),
    onSurface = Color(0xFFDFE4DD),
    surfaceVariant = Color(0xFF404943),
    onSurfaceVariant = Color(0xFFC0C9C1),
    outline = Color(0xFF8A938B),
    outlineVariant = Color(0xFF404943),
    scrim = Color(0xFF000000),
    inverseSurface = Color(0xFFDFE4DD),
    inverseOnSurface = Color(0xFF2C322D),
    inversePrimary = Color(0xFF006D3F),
    surfaceDim = Color(0xFF0F1511),
    surfaceBright = Color(0xFF353B36),
    surfaceContainerLowest = Color(0xFF0A0F0C),
    surfaceContainerLow = Color(0xFF171D19),
    surfaceContainer = Color(0xFF1B211D),
    surfaceContainerHigh = Color(0xFF262B27),
    surfaceContainerHighest = Color(0xFF303632),
)

@Composable
fun NoteRexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S ->
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // ─── Status bar ──────────────────────────────────────
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}