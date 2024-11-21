package com.example.project6.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.project6.model.DataMahasiswa

@Composable
fun detailMahasiswa(uiSateMahasiswa: DataMahasiswa, onBackButton:()-> Unit, modifier: Modifier = Modifier)
{
    val listDataMhs = listOf(
        Pair("Nama", uiSateMahasiswa.nama),
        Pair("Gender", uiSateMahasiswa.gender),
        Pair("Alamat", uiSateMahasiswa.alamat),
        Pair("Email", uiSateMahasiswa.Email),
        Pair("noHP", uiSateMahasiswa.noHP),
    )

    Column {
        listDataMhs.forEach(){ item ->
            MainSection(judulParam = item.first, isipParam = item.second)}

        Button(onClick = { onBackButton() }) {
            Text(text = "Kembali")
        }
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
