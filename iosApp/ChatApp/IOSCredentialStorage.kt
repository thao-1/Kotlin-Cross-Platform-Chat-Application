package com.example.chatapp.platform

import platform.Foundation.NSUserDefaults

class IOSCredentialStorage {
    private val defaults = NSUserDefaults.standardUserDefaults

    fun saveToken(token: String) {
        defaults.setObject(token, forKey = "auth_token")
    }

    fun getToken(): String? = defaults.stringForKey("auth_token")
}
