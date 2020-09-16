package com.laskdjlaskdj12.FactoryPattern

class MozalelaPizza : Pizza {
    override fun prepare() {
        println("[MozalelaPizza] preparing..")
    }

    override fun bake() {
        println("[MozalelaPizza] baking..")
    }

    override fun cut() {
        println("[MozalelaPizza] cuting..")
    }

    override fun box() {
        println("[MozalelaPizza] boxing..")
    }
}
