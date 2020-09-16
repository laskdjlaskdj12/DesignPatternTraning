package com.laskdjlaskdj12.AdapterPattern.Adapter

import com.laskdjlaskdj12.AdapterPattern.Encrypt.SHA256

class SHAAdapter:ICrypt{
    private val sha = SHA256()

    override fun setKey(key: String) {
        sha.setSoltKey(key)
    }

    override fun encrypt(message: String): ByteArray {
        return sha.hash(message).toByteArray()
    }

    override fun decrypt(message: ByteArray): String {
        return ""
    }
}