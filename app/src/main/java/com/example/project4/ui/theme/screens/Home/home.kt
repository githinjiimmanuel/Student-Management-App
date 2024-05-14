package com.example.project4.ui.theme.screens.Home


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.project4.R
import com.example.project4.navigation.ROUTE_LOGIN
import com.example.project4.navigation.ROUTE_REGISTER
import com.example.project4.navigation.ROUTE_STUDENTS
import com.example.project4.navigation.ROUTE_USER
import com.example.project4.ui.theme.Project4Theme

class TopAppBar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopAppBar()

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopApp() {
    Box {
        Image(painter = painterResource(id = R.drawable.p7 ), contentDescription = ".", contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }
    androidx.compose.material3.TopAppBar(title = { Text(text = "emobilis")},
        navigationIcon = { IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.p7), contentDescription = "Students Management")

        }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White ,
            navigationIconContentColor = Color.White
        ), actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Person, contentDescription ="My profile", tint = Color.Black )
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Search")
                Icon(imageVector = Icons.Filled.Person, contentDescription = " Home" )

            }
        }
    )

}

@Preview
@Composable
fun TopAppBarPreview () {
    TopAppBarPreview()
}


@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize(),
//        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
//        var productdata=ProductViewModel(NavController,context)

        Text(text = "Welcome to Home page",
            color = Color.White,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.height(70.dp))

        Button(onClick = {
            navController.navigate(ROUTE_REGISTER)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Admin")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_STUDENTS)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Students")
        }

        Button(onClick = {
            navController.navigate(ROUTE_USER)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "User")
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}