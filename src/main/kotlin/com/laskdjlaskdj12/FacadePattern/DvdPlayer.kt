package com.laskdjlaskdj12.FacadePattern

class DvdPlayer {
    var name:String = ""

    fun on() {
        println("Dvd Player on")
    }

    fun play(name: String) {
        this.name = name
        println("play ${this.name}")
    }

    fun stop() {
        println("stop play $name")
    }

    fun eject() {
        println("eject $name")
    }

    fun off() {
        println("turn off dvd player")
    }

}
