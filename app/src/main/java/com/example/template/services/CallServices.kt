package com.example.template.services

import com.example.template.services.Interfaces.ServicesApp

object CallServices {

    fun callService() = RetrofitClient.retrofitApp().create(
        ServicesApp::class.java
    )

}