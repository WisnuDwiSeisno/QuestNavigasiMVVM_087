package com.example.project6

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.project6.ui.viewmodel.MahasiswaViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import com.example.project6.model.DataKelamin
import com.example.project6.ui.view.FormMahasiswaView
import androidx.navigation.compose.composable

enum class Halaman {
    Formulir,
    Detail,
}

@Composable
fun PengelolaHalaman(
    navController: NavController = rememberNavController(),
    viewModel: MahasiswaViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    NavHost(navController = navController, startDestination = Halaman.Formulir.name) {
        composable(route = Halaman.Formulir.name) {
            val konteks = LocalContext.current
            FormMahasiswaView(
                listJK = DataKelamin.listJK.map { id ->
                    konteks.resources.getString(
                        id
                    )
                },
                onSubmitClicked = {}
            )
        }
    }

}