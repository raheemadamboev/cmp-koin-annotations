package xyz.teamgravity.cmpkoinannotations

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import xyz.teamgravity.cmpkoinannotations.injection.app.initializeKoin

fun main() {
    initializeKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMPKoinAnnotations",
        ) {
            App()
        }
    }
}