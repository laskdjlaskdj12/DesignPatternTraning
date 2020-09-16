package com.laskdjlaskdj12.AdapterPattern.Adapter

interface ICrypt {

    fun setKey(key:String)

    fun encrypt(message:String):ByteArray

    fun decrypt(message:ByteArray):String

}