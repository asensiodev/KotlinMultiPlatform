package screens.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

// Use object if the class is not going to be reusable
object ProfileTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Menu)
            return remember { TabOptions(index = 3u, title = "Menu", icon = icon) }
        }

    @Composable
    override fun Content() {
        Box(
            modifier = Modifier.fillMaxWidth().background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text("Profile Screen", fontSize = 22.sp, color = Color.Black)
        }
    }

}