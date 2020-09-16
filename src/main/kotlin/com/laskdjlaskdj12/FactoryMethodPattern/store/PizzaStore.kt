package com.laskdjlaskdj12.FactoryMethodPattern.store

import com.laskdjlaskdj12.FactoryMethodPattern.pizza.Pizza

abstract class PizzaStore {
    fun orderPizza(type: String) {
        val pizza = createPizzaRecepie(type)
        pizza.prepare()
        pizza.bake()
        pizza.box()
        pizza.cut()
    }

    abstract fun createPizzaRecepie(type:String): Pizza
}