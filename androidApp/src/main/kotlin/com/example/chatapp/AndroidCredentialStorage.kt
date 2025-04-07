package platform

import android.content.Context
import android.content.SharedPreferences

class AndroidCredentialStorage(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("creds", Context.MODE_PRIVATE)

    fun saveToken(token: String) {
        prefs.edit().putString("auth_token", token).apply()
    }

    fun getToken(): String? = prefs.getString("auth_token", null)
}
