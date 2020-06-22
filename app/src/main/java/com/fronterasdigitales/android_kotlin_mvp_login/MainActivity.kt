package com.fronterasdigitales.android_kotlin_mvp_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.fronterasdigitales.android_kotlin_mvp_login.Presenter.ILoginPresenter
import com.fronterasdigitales.android_kotlin_mvp_login.Presenter.LoginPresenter
import com.fronterasdigitales.android_kotlin_mvp_login.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView{

    override fun OnLoginSuccess(message: String) {
        Toasty.success(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun OnLoginError(message: String) {
        Toasty.error(this,message,Toast.LENGTH_SHORT).show()
    }

    internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        btn_login.setOnClickListener {
            loginPresenter.onLogin(edt_email.text.toString(),edt_password.text.toString())
        }
    }
}
