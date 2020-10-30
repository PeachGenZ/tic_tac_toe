package com.peachgenz.tictactoe.manager

import android.content.Context

object Contextor {
    private var mContext: Context? = null

    fun init(context:Context){
        mContext = context
    }

    fun getContext() : Context {
        return mContext!!
    }
}