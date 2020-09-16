package com.laskdjlaskdj12.FactoryPattern

class PepporniPizza : Pizza {
    override fun prepare() {
        println("[PepporniPizza] baking..")
    }

    override fun bake() {
        println("[PepporniPizza] baking..")
    }

    override fun cut() {
        println("[PepporniPizza] baking..")
    }

    override fun box() {
        println("[PepporniPizza] baking..")
    }

}
