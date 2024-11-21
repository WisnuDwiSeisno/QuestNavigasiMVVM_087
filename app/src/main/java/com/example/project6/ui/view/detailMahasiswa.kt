package com.example.project6.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.project6.model.DataMahasiswa

@Composable
fun detailMahasiswa(modifier: Modifier = Modifier, uiSateMahasiswa: DataMahasiswa)
{
    val listDataMhs = listOf(
        Pair("Nama", uiSateMahasiswa.nama),
        Pair("Gender", uiSateMahasiswa.gender),
        Pair("Alamat", uiSateMahasiswa.alamat),
    )

    Column {
        listDataMhs.forEach(){ item ->
            MainSection(judulParam = item.first, isipParam = item.second)}
    }
}

@Composable
fun MainSection(judulParam:String, isipParam:String){
    Column {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = judulParam, Modifier.weight(0.8f))
            Text(text = ":", Modifier.weight(0.2f))
            Text(text = isipParam, Modifier.weight(2f))
        }
    }
}
