package com.laskdjlaskdj12.FactoryMethodPattern.factory

import com.laskdjlaskdj12.FactoryMethodPattern.pizza.CheesePizza
import com.laskdjlaskdj12.FactoryMethodPattern.pizza.MozalelaPizza
import com.laskdjlaskdj12.FactoryMethodPattern.pizza.PepporniPizza
import com.laskdjlaskdj12.FactoryMethodPattern.pizza.Pizza

class PizzaFactory(val pizzaIngredientFactory: PizzaIngredientFactory) {

    fun create(type: String): Pizza {
        when (type) {
            "cheese" -> return CheesePizza(pizzaIngredientFactory)
            "mozalela" -> return MozalelaPizza(pizzaIngredientFactory)
            "pepporni" -> return PepporniPizza(pizzaIngredientFactory)
            else -> throw RuntimeException("No such Pizza")
        }
    }
}