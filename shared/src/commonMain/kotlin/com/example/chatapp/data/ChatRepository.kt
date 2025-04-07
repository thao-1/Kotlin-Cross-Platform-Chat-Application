package com.example.chatapp.data

import com.example.chatapp.domain.Message

interface ChatRepository {
    suspend fun sendMessage(message: Message)
    suspend fun getMessages(onMessageReceived: (List<Message>) -> Unit)
}