package com.laskdjlaskdj12.AdapterPattern.Encrypt

class SHA256{
    private var middleKey = ""
    private var privateKey = ""

    fun setSoltKey(key: String) {
        this.middleKey = key
    }

    fun hash(message: String): String {
        return "[SHA] encrypt message :$message \n" +
                "middle key : $middleKey \n" +
                "private key : $privateKey"
    }
}