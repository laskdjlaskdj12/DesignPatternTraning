package com.laskdjlaskdj12.AdapterPattern

import com.laskdjlaskdj12.AdapterPattern.Adapter.AESAdapter
import com.laskdjlaskdj12.AdapterPattern.Adapter.SHAAdapter

fun main(args: Array<String>) {
    val aes = AESAdapter()
    val sha = SHAAdapter()
    
    println(aes.encrypt("This is Message"))
    println(aes.decrypt("This is Message".toByteArray()))
    
    println(sha.encrypt("This is Message"))
    println(sha.decrypt("This is Message".toByteArray()))
}