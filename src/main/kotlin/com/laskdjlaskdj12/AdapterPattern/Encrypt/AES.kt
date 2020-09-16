package com.laskdjlaskdj12.AdapterPattern.Encrypt

class AES {
    private var middleKey = ""
    private var privateKey = ""

    fun setMiddleKey(key: String) {
        this.middleKey = key
    }

    fun setPrivateKey(key: String) {
        this.privateKey = key
    }

    fun encrypt(message: String): String {
        return "[AES] encrypt message :$message \n" +
                "middle key : $middleKey \n" +
                "private key : $privateKey"
    }

    fun decrypt(message: String): String{
        return "[AES] decrypt message :$message \n" +
                "middle key : $middleKey \n" +
                "private key : $privateKey"    }
}
