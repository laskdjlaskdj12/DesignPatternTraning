package com.laskdjlaskdj12.FactoryMethodPattern

import com.laskdjlaskdj12.FactoryMethodPattern.store.KoreanPizzaStore

fun main(args: Array<String>) {
    val pizzaStore = KoreanPizzaStore()
    pizzaStore.orderPizza("cheese")
    pizzaStore.orderPizza("pepporni")
}