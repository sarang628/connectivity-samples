package com.example.networkutillibrary

import android.net.ConnectivityManager
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun currentTypeBlueTooth(){
        val networkUtil = NetworkUtilImpl()
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(ConnectivityManager.TYPE_BLUETOOTH, networkUtil.test(appContext))
    }

    @Test
    fun currentTypeEthernet(){
        val networkUtil = NetworkUtilImpl()
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(ConnectivityManager.TYPE_ETHERNET, networkUtil.test(appContext))
    }

    @Test
    fun currentTypeWifi(){
        val networkUtil = NetworkUtilImpl()
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(ConnectivityManager.TYPE_WIFI, networkUtil.test(appContext))
    }

    @Test
    fun currentTypeMobile(){
        val networkUtil = NetworkUtilImpl()
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(ConnectivityManager.TYPE_MOBILE, networkUtil.test(appContext))
    }
}