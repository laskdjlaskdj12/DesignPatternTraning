package com.laskdjlaskdj12.SingletonPattern

import java.util.function.Consumer

object Singleton {
    val allEmployee = arrayListOf<String>()

    fun showEmployee(): String {
        val builder = StringBuilder()
        allEmployee.stream().forEach {
            builder.append(it)
                .append("\n")
        }

        return builder.toString()
    }
}