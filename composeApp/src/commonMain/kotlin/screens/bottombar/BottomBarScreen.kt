package screens.bottombar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator

class BottomBarScreen : Screen {
    @Composable
    override fun Content() {
        TabNavigator(
            HomeTab,
            tabDisposable = { TabDisposable(it, listOf(HomeTab, FavTab, ProfileTab)) }
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(it.current.options.title) })
                },
                bottomBar = {
                    BottomNavigation {
                        val tabNavigator = LocalTabNavigator.current
                        NavigationItems(tabNavigator)
                    }
                }
            ) {
                CurrentTab()
            }
        }
    }

    @Composable
    private fun RowScope.NavigationItems(tabNavigator: TabNavigator) {
        BottomNavigationItem(
            selected = tabNavigator.current.key == key,
            onClick = { tabNavigator.current = HomeTab },
            icon = {
                Icon(
                    painter = HomeTab.options.icon!!,
                    contentDescription = null
                )
            },
            label = { Text(HomeTab.options.title) },
        )
        BottomNavigationItem(
            selected = tabNavigator.current.key == key,
            onClick = { tabNavigator.current = FavTab },
            icon = {
                Icon(
                    painter = FavTab.options.icon!!,
                    contentDescription = null
                )
            },
            label = { Text(FavTab.options.title) },
        )
        BottomNavigationItem(
            selected = tabNavigator.current.key == key,
            onClick = { tabNavigator.current = ProfileTab },
            icon = {
                Icon(
                    painter = ProfileTab.options.icon!!,
                    contentDescription = null
                )
            },
            label = { Text(ProfileTab.options.title) },
        )
    }
}