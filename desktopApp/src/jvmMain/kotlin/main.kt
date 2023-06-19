import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import moe.tlaster.precompose.PreComposeWindow

fun main() {

  application {
    val windowState = rememberWindowState()

    PreComposeWindow(
      onCloseRequest = ::exitApplication,
      state = windowState
    ) {
      MainView()
    }
  }
}