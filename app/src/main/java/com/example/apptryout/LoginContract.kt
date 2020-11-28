package com.example.apptryout

import com.example.apptryout.model.ContactModel
import com.example.apptryout.model.LoginBody

interface LoginContract {

    interface View{
        fun onSuccessLogin(token: String)
        fun onSuccessGetContact(list: List<ContactModel>)
    }

    interface Presenter{
        fun userLogin(loginBody: LoginBody)
        fun getAllContact()
    }
}