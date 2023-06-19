import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.lalilu.screen.HomeScreen
import com.lalilu.screen.SettingsScreen
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition

@Composable
fun App() {
  MaterialTheme {
    val navigator = rememberNavigator()

    NavHost(
      navigator = navigator,
      navTransition = NavTransition(),
      initialRoute = "/home",
    ) {
      scene(
        route = "/home",
        navTransition = NavTransition(),
      ) {
        HomeScreen { navigator.navigate("/settings") }
      }

      scene(
        route = "/settings",
        navTransition = NavTransition()
      ) {
        SettingsScreen { navigator.popBackStack() }
      }
    }
  }
}

expect fun getPlatformName(): String