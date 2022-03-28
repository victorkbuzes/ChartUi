package com.example.chartui.presentation.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen(
    val id: String,
    val title: String,
    val icon: ImageVector
){
    object  Home: BottomNavScreen("home", "Home", Icons.Outlined.Home)
    object  Search: BottomNavScreen("search", "Search", Icons.Outlined.Search)
    object  Add: BottomNavScreen("add", "Add", Icons.Outlined.Add)
    object Favourite: BottomNavScreen("favourite", "Favourite", Icons.Outlined.Favorite)
    object  Profile: BottomNavScreen("profile", "Profile", Icons.Outlined.Person)




    object  Items {
        var list = listOf(
            Home, Add, Search, Favourite, Profile,
        )
    }


}
