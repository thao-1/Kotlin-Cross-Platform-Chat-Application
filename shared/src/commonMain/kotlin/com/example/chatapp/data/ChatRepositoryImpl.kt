package com.example.chatapp.data

import com.example.chatapp.domain.Message
import com.example.chatapp.utils.EncryptionUtil
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map

class ChatRepositoryImpl : ChatRepository {
    private val messages = MutableStateFlow<List<Message>>(emptyList())

    override suspend fun sendMessage(message: Message) {
        val encryptedContent = EncryptionUtil.encryptMessage(message.content)
        val encryptedMessage = message.copy(content = encryptedContent)
        messages.value = messages.value + encryptedMessage
    }

    override suspend fun getMessages(onMessageReceived: (List<Message>) -> Unit) {
        messages.collect { encryptedMessages ->
            val decryptedMessages = encryptedMessages.map { message ->
                message.copy(content = EncryptionUtil.decryptMessage(message.content))
            }
            onMessageReceived(decryptedMessages)
        }
    }
} 