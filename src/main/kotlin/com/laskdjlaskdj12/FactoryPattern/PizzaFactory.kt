package com.laskdjlaskdj12.FactoryPattern

class PizzaFactory {
    fun create(type: String): Pizza {
        when (type) {
            "cheese" -> return CheesePizza()
            "mozalela" -> return MozalelaPizza()
            "pepporni" -> return PepporniPizza()
            else -> throw RuntimeException("No such Pizza")
        }
    }
}