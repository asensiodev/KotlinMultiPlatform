import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.FadeTransition
import screens.MainScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(MainScreen()) { navigator ->
            FadeTransition(navigator)
        }
    }
}