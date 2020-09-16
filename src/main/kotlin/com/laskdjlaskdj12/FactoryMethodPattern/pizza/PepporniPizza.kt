package com.laskdjlaskdj12.FactoryMethodPattern.pizza

import com.laskdjlaskdj12.FactoryMethodPattern.factory.PizzaIngredientFactory

class PepporniPizza(private val pizzaIngredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        this.cheese = pizzaIngredientFactory.createCheese()
        this.clams = pizzaIngredientFactory.createClams()
        this.dough = pizzaIngredientFactory.createDough()
        this.pepperoni = pizzaIngredientFactory.createPepperoni()
        this.sauce = pizzaIngredientFactory.createSauce()
        this.veggies = pizzaIngredientFactory.createVeggies()

        println("[PepporniPizza] preparing..")
    }
}
