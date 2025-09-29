package com.example.unihub.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.unihub.model.Member
import com.example.unihub.model.OdsInfo
import com.example.unihub.ui.components.MemberCard
import com.example.unihub.ui.components.OdsSection
import com.example.unihub.ui.components.ProjectIntroductionSection
import com.example.unihub.ui.components.SectionTitle
import com.example.unihub.ui.theme.UnihubTheme // Corrigido para o nome do seu tema

val teamMembers = listOf(
    Member(1, "Bruno Freitas", "Dev Back-end", "https://media.licdn.com/dms/image/v2/D4D03AQEpoIm7LaRfFg/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1711635621492?e=1761782400&v=beta&t=fuIUjqDd5Ayf5FtIEu7CtFWoBzwRF82T2RfhMnChZCc"),
    Member(2, "Caio Moraes", "Designer UX/UI", "https://media.licdn.com/dms/image/v2/D4D35AQHAiSjUXzYbNw/profile-framedphoto-shrink_800_800/profile-framedphoto-shrink_800_800/0/1712339059426?e=1759726800&v=beta&t=05u2GD_GBDn9kyHbGDR2jgU7p0cgzmhm4bK-CQmv4FA"),
    Member(3, "Isabela Chaves", "Dados e documentação", "https://media.licdn.com/dms/image/v2/D4D03AQF9fs5GwX70IA/profile-displayphoto-shrink_400_400/B4DZagKMgFGwAo-/0/1746443749819?e=1761782400&v=beta&t=LIwzx3UW2sOai7WL6xsQq5hoF4o_NtkOJetaNC2Ka0k"),
    Member(4, "Mauricio Bertoldo", "Dev Front-end e Redes", "https://media.licdn.com/dms/image/v2/D4D03AQGsQmP9Qvij3g/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1720096912961?e=1761782400&v=beta&t=jowsoc7S35nLc8A0VqI1CQYraJsQF1Vf9C1EuMw8bbc"),
    Member(5, "Ruth Mendonça", "Machine Learning e Cybersecurity", "https://media.licdn.com/dms/image/v2/D4D03AQHZwN2MkabmSA/profile-displayphoto-crop_800_800/B4DZfQ0_uEGYAI-/0/1751555243778?e=1761782400&v=beta&t=JPtjO_3-lOiY0yOEN4Uya3w06pUb84Gx69dzVtWzvH4")
)
val odsList = listOf(
    OdsInfo("ODS 4: Educação de Qualidade", "Busca assegurar educação inclusiva, justa e de qualidade, além de promover oportunidades de aprendizagem ao longo da vida para todos.", "https://maristalab.com.br/wp-content/uploads/2022/09/educacao-infantil-de-qualidade.png"),
    OdsInfo("ODS 10: Redução das Desigualdades", "Visa reduzir a desigualdade de renda, oportunidades e poder dentro dos países e entre eles, promovendo a inclusão de todos.", "https://www.unisuam.edu.br/wp-content/uploads/2025/04/Reducao-das-Desigualdades-Conheca-o-ODS-10-da-Agenda-2030-da-ONU.jpg")
)


@Composable
fun LandingPageScreen() { // O nome da função pode ser diferente do nome do arquivo
    LazyColumn(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            ProjectIntroductionSection(); Spacer(modifier = Modifier.height(24.dp)) }
        item {
            SectionTitle(title = "Nossos Objetivos (ODS)"); Spacer(modifier = Modifier.height(8.dp));
            OdsSection(odsList); Spacer(modifier = Modifier.height(24.dp)) }
        item { SectionTitle(title = "Equipe do Projeto"); Spacer(modifier = Modifier.height(16.dp)) }
        items(teamMembers, key = { it.id }) { member -> MemberCard(member = member); Spacer(modifier = Modifier.height(12.dp)) }
    }
}




@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun LandingPagePreview() {
    UnihubTheme { // Corrigido para o nome do seu tema
         LandingPageScreen()
    }
}