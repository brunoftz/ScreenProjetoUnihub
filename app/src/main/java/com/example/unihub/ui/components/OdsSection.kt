package com.example.unihub.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unihub.model.OdsInfo
import com.example.unihub.ui.components.OdsCard
import com.example.unihub.ui.theme.UnihubTheme

@Composable
fun OdsSection(odsItems: List<OdsInfo>) {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) { odsItems.forEach { ods -> OdsCard(ods = ods) } }
}

@Preview
@Composable
private fun OdsSectionPreview() {
    UnihubTheme {
//        OdsSection()
    }
}