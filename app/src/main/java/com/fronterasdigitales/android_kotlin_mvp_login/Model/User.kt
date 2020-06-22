package com.fronterasdigitales.android_kotlin_mvp_login.Model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User (override val email: String,override val password: String): IUser{
    override fun isDataValid(): Int {
        if(TextUtils.isEmpty(email))
            return 0 // 0 error email esta vacio
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            return 1 // 1 error patron no matchea con el email
        else if(password.length <=6)
            return 2 // 2 error
        else
            return -1

    }
}