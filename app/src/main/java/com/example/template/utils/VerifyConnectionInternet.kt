package com.example.template.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

class VerifyConnectionInternet(private val context: Context) {

    fun isNetworkAvailable() {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(network)

        if (capabilities?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) != true){
            // show message not access internet
        }
    }

}