package com.fronterasdigitales.android_kotlin_mvp_login.View

interface ILoginView {
    fun OnLoginSuccess(message: String)
    fun OnLoginError(message: String)
}