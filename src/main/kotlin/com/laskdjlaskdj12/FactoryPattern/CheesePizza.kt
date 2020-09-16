package com.laskdjlaskdj12.FactoryPattern

class CheesePizza : Pizza {
    override fun prepare() {
        println("[CheesePizza] preparing..")
    }

    override fun bake() {
        println("[CheesePizza] baking..")
    }

    override fun cut() {
        println("[CheesePizza] cuting..")
    }

    override fun box() {
        println("[CheesePizza] boxing..")
    }
}