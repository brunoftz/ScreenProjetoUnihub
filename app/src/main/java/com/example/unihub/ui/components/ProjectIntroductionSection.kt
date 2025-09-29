package com.example.unihub.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unihub.ui.theme.UnihubTheme

@Composable
fun ProjectIntroductionSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(top = 24.dp)) {
        Text("UNIHUB - Projeto Integrador", style = MaterialTheme.typography.headlineLarge, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        Text("Em um ambiente escolar, a segurança do aluno é prioridade, inclusive no espaço digital. O sistema ReSist nasce com o propósito de criar uma barreira inteligente contra conteúdos ofensivos e inadequados na internet. Por meio de uma Inteligência Artificial com Processamento de Linguagem Natural, nosso sistema analisa as páginas acessadas na rede da escola e, ao identificar qualquer forma de discurso de ódio ou conteúdo impróprio, realiza o bloqueio instantâneo, protegendo os estudantes e promovendo um ambiente online mais saudável e seguro para a educação.", style = MaterialTheme.typography.bodyLarge, textAlign = TextAlign.Justify, modifier = Modifier.padding(top = 12.dp))
    }
}

@Preview
@Composable
private fun ProjectIntroductionSectionPreview() {
    UnihubTheme{
        ProjectIntroductionSection()
    }

}