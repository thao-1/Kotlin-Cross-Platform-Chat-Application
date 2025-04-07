package com.example.chatapp.data

interface AuthRepository {
    suspend fun signIn(email: String, password: String): Boolean
    suspend fun signUp(email: String, password: String): Boolean
    fun getCurrentUserId(): String?
}
