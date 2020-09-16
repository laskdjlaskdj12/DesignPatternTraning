package com.laskdjlaskdj12.FactoryMethodPattern.store

import com.laskdjlaskdj12.FactoryMethodPattern.factory.NYPizzaingredientFactory
import com.laskdjlaskdj12.FactoryMethodPattern.factory.PizzaFactory
import com.laskdjlaskdj12.FactoryMethodPattern.pizza.Pizza

class KoreanPizzaStore : PizzaStore() {
    val pizzaIngredientFactory = NYPizzaingredientFactory()

    override fun createPizzaRecepie(type: String): Pizza {
        return PizzaFactory(pizzaIngredientFactory).create(type)
    }
}