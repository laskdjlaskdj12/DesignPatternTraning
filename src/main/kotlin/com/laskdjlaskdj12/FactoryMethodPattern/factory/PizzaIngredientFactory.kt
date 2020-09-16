package com.laskdjlaskdj12.FactoryMethodPattern.factory

import com.laskdjlaskdj12.FactoryMethodPattern.ingredient.*

interface PizzaIngredientFactory{
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): Array<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClams(): Clams
}