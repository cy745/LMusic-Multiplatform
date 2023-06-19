package com.lalilu.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen(onPopUp: () -> Unit) {
  Column(modifier = Modifier.padding(16.dp)) {
    Text("Settings", modifier = Modifier.clickable { onPopUp() })

    Text("HOME")
  }
}