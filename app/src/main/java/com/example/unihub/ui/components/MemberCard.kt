package com.example.unihub.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.unihub.model.Member
import com.example.unihub.ui.theme.UnihubTheme

@Composable
fun MemberCard(member: Member) {
    Card(modifier = Modifier.fillMaxWidth(), elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)) {
        Row(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(model = member.photoUrl, contentDescription = "Foto de ${member.name}", modifier = Modifier
                .size(80.dp)
                .clip(
                    CircleShape
                ), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(member.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                Text(member.role, style = MaterialTheme.typography.bodyMedium, color = Color.Gray)
            }
        }
    }
}

@Preview
@Composable
private fun MemberCardPreview() {
    UnihubTheme {
//        MemberCard()
    }

}