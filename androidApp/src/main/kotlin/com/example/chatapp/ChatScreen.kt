package com.example.chatapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ChatScreen() {
    var message by remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize().padding(16.dp)) {
        BasicTextField(value = message, onValueChange = { message = it })
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            // Call repo.sendMessage(...)
        }) {
            Text("Send")
        }
    }
}