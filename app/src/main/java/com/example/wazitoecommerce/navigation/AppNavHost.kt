package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.nailz.NailzScreen
import com.example.wazitoecommerce.ui.theme.screens.pay.PayScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen

import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.report.ReportScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.SplashScreen
import com.example.wazitoecommerce.ui.theme.screens.test.TestScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }

        composable(SPLASH_URL){
            SplashScreen(navController = navController)
        }

        composable(NAILZ_URL){
               NailzScreen(navController = navController)
        }
        composable(REPORT_URL){
              ReportScreen(navController = navController)
        }
        composable(TEST_URL){
            TestScreen(navController =navController)
        }
        composable(PAY_URL){
            PayScreen(navController = navController)
        }



    }
}



