package com.laskdjlaskdj12.FactoryPattern

class PizzaStore(private val factory: PizzaFactory) {
    fun orderPizza(type: String) {
        val pizza = factory.create(type)
        pizza.bake()
        pizza.box()
        pizza.cut()
        pizza.prepare()
    }
}