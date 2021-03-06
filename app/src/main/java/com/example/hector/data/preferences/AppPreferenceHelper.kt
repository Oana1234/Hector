package com.example.hector.data.preferences

import android.content.Context
import android.content.SharedPreferences
import com.example.hector.annotations.PreferenceInfo
import javax.inject.Inject

class AppPreferenceHelper @Inject constructor(context: Context) : PreferenceHelper {

    companion object {
        private val PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE"
        private val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        private val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
        private val PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME"
        private val PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL"
    }

}