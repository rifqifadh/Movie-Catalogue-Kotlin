package com.example.moviecataloguekotlin.Base

import android.support.annotation.StringRes

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun showErrorMessage(message:String?)
    fun showInfoMessage(message:String?)
}