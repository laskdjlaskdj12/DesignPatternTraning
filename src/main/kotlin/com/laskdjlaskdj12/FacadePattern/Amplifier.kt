package com.laskdjlaskdj12.FacadePattern

class Amplifier {

    private var dvd:DvdPlayer? = null

    fun on() {
        println("Amplifier on")
    }

    fun setDvd(dvd: DvdPlayer) {
        this.dvd = dvd
    }

    fun off() {
        println("Amplifier off")
    }
}
