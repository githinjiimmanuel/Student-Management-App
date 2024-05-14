package com.example.project4.ui.theme.screens.Students


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project4.data.AuthViewModel
import com.example.project4.models.Students


@Composable
fun ViewStudentScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        val context = LocalContext.current
        val studentsRepository = AuthViewModel(navController, context)
        val emptyStudentsState = remember { mutableStateOf(Students("","","","")) }
        val emptyStudentsListState = remember { mutableStateListOf<Students>() }

//        val students = studentsRepository.savestudents(emptyStudentsState,emptyStudentsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All students",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))


//            LazyColumn(){
//                items(students){
//                    Students(
//                        name = it.name,
//                        class = it.class,
//                        year = it.year,
//                        id = it.id,
//                        navController = navController,
//                        productRepository = productRepository
//                    )
//                }
//            }
        }
    }

}



//@Composable
//fun ProductItem(name:String, quantity:String, price:String, id:String,
//                navController:NavHostController, productRepository:AuthViewModel) {

//    Column(modifier = Modifier.fillMaxWidth()) {
//        Text(text = name)
//        Text(text = quantity)
//        Text(text = price)
//        Button(onClick = {
//            productRepository.deleteStudents(id)
//        }) {
//            Text(text = "Delete")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_UPDATE_PRODUCT+"/$id")
//        }) {
//            Text(text = "Update")
//        }
//    }


@Preview
@Composable
fun ViewStudentScreenPreview() {
    ViewStudentScreen(rememberNavController())

}

