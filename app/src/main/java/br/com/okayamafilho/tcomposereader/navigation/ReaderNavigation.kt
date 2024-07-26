package br.com.okayamafilho.tcomposereader.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.okayamafilho.tcomposereader.screens.ReaderSplashScreen
import br.com.okayamafilho.tcomposereader.screens.home.HomeScreen
import br.com.okayamafilho.tcomposereader.screens.login.LoginScreen
import br.com.okayamafilho.tcomposereader.screens.search.SearchScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ReaderScreens.SplashScreen.name) {
        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }

        composable(ReaderScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(ReaderScreens.SearchScreen.name) {
            SearchScreen(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }
    }

}