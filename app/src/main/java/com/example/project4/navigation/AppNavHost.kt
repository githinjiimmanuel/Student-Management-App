package com.example.project4.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project4.ui.theme.screens.Home.HomeScreen
import com.example.project4.ui.theme.screens.Login.LoginScreen
import com.example.project4.ui.theme.screens.Register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier =Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_REGISTER) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_STUDENTS) {
            LoginScreen(navController)
        }
        composable(ROUTE_ADD_STUDENTS) {
            LoginScreen(navController)
        }
        composable(ROUTE_USER) {
            LoginScreen(navController)
        }
    }
}