package com.fronterasdigitales.android_kotlin_mvp_login.Presenter

import com.fronterasdigitales.android_kotlin_mvp_login.Model.User
import com.fronterasdigitales.android_kotlin_mvp_login.View.ILoginView

class LoginPresenter (internal var ILoginView:ILoginView): ILoginPresenter {

    override fun onLogin(email: String, password: String) {
        val user = User(email,password)
        val loginCode = user.isDataValid()
        if(loginCode == 0){
            ILoginView.OnLoginError("Email must not be null")
        } else if(loginCode == 1){
            ILoginView.OnLoginError("Wrong email address")
        } else if(loginCode == 2){
            ILoginView.OnLoginError("Password must be greater than 6")
        }else {
            ILoginView.OnLoginSuccess("Login Success")
        }
    }


}