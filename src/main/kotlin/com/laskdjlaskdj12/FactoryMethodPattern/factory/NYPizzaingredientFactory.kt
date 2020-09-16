package com.laskdjlaskdj12.FactoryMethodPattern.factory

import com.laskdjlaskdj12.FactoryMethodPattern.ingredient.*

class NYPizzaingredientFactory:PizzaIngredientFactory{
    override fun createDough(): Dough {
        return Dough()
    }

    override fun createSauce(): Sauce {
        return Sauce()
    }

    override fun createCheese(): Cheese {
        return Cheese()
    }

    override fun createVeggies(): Array<Veggies> {
        return Array(1) { Veggies() }
    }

    override fun createPepperoni(): Pepperoni {
        return Pepperoni()
    }

    override fun createClams(): Clams {
        return Clams()
    }

}