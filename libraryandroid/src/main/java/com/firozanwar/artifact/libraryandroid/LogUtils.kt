package com.firozanwar.artifact.libraryandroid

import com.firozanwar.artifact.kotlinlib.MyUtils

class LogUtils {

    companion object {
        fun d(message: String) {
            println(message)
            println(MyUtils.getDefaultMessage())
        }
    }
}