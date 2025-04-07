package com.example.chatapp.data

import dev.gitlive.firebase.auth.FirebaseAuth
import dev.gitlive.firebase.auth.auth
import dev.gitlive.firebase.Firebase

class AuthRepositoryImpl : AuthRepository {
    private val auth = Firebase.auth
    
    override suspend fun signIn(email: String, password: String): Boolean {
        return try {
            auth.signInWithEmailAndPassword(email, password)
            true
        } catch (e: Exception) {
            false
        }
    }
    
    override suspend fun signUp(email: String, password: String): Boolean {
        return try {
            auth.createUserWithEmailAndPassword(email, password)
            true
        } catch (e: Exception) {
            false
        }
    }
    
    override fun getCurrentUserId(): String? {
        return auth.currentUser?.uid
    }
} 