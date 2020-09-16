package com.laskdjlaskdj12.FactoryPattern

import java.util.*

fun main(args: Array<String>) {
    val pizzaStore = PizzaStore(PizzaFactory())
    pizzaStore.orderPizza("cheese")
    pizzaStore.orderPizza("pepporni")
}