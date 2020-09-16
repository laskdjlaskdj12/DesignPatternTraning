package com.laskdjlaskdj12.FactoryMethodPattern.pizza

import com.laskdjlaskdj12.FactoryMethodPattern.ingredient.*

abstract class Pizza() {

    protected var dough:Dough? = null
    protected var sauce: Sauce? = null
    protected var veggies:Array<Veggies>? = null
    protected var cheese: Cheese? = null
    protected var pepperoni: Pepperoni? = null
    protected var clams: Clams? = null

    abstract fun prepare()

    fun bake(){
        println("backe Pizza")
    }

    fun cut(){
        println("cut Pizza")
    }

    fun box(){
        println("boxing Pizza")
    }
}