package com.example.networkutillibrary

import android.content.Context
import android.net.ConnectivityManager

class NetworkUtilImpl : NetworkUtil {
    fun test(context: Context) : Int{
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo.type
    }
}