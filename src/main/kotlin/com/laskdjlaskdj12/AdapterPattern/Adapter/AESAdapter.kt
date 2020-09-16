package com.laskdjlaskdj12.AdapterPattern.Adapter

import com.laskdjlaskdj12.AdapterPattern.Encrypt.AES

class AESAdapter :ICrypt{
    private val aes = AES()

    override fun setKey(key: String) {
        aes.setMiddleKey("This is Key")
        aes.setPrivateKey(key)
    }

    override fun encrypt(message: String): ByteArray {
        return aes.encrypt(message).toByteArray()
    }

    override fun decrypt(message: ByteArray): String {
        return aes.decrypt(message.decodeToString())
    }
}