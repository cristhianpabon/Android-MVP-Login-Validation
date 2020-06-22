package com.fronterasdigitales.android_kotlin_mvp_login.Model

interface IUser {
    val email: String
    val password: String
    fun isDataValid(): Int
}