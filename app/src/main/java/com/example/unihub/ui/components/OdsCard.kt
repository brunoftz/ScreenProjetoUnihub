package com.example.unihub.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.unihub.model.OdsInfo

@Composable
fun OdsCard(ods: OdsInfo) {
    Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
            containerColor = Color(0xFF3366FF)
            )){
        Column {
            AsyncImage(model = ods.imageUrl, contentDescription = "Imagem para ${ods.title}", modifier = Modifier.fillMaxWidth().height(150.dp), contentScale = ContentScale.Crop)
            Column(modifier = Modifier.padding(16.dp)) {
                Text(ods.title, color = (Color.White) ,style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.SemiBold,)
                Spacer(modifier = Modifier.height(8.dp))
                Text(ods.description, color = (Color.White), style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}