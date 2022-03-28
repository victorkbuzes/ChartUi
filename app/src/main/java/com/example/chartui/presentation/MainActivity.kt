package com.example.chartui.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.example.chartui.presentation.screens.BottomNavScreen
import com.example.chartui.presentation.details.BottomNavigation
import com.example.chartui.presentation.ui.theme.ChartUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor=MaterialTheme.colors.background.toArgb()
            window.navigationBarColor=MaterialTheme.colors.background.toArgb()

            var currentScreen = mutableStateOf<BottomNavScreen>(BottomNavScreen.Home)
            ChartUiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = { TopAppBar() {

                        }},

                        bottomBar = {
                            BottomNavigation(currentScreenId = currentScreen.value.id ){
                                currentScreen.value= it

                            }
                        }
                    ) {

                    }

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChartUiTheme {
    }
}