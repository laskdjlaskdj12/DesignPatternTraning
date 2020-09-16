package com.laskdjlaskdj12.FacadePattern

fun main(arrays: Array<String>) {
    val homeTheaterLights = HomeTheaterFacade(
        Amplifier(),
        Tuner(),
        DvdPlayer(),
        Projector(),
        TheaterLights(),
        PopcornPopper()
    )

    homeTheaterLights.watchMovie("어거스트 러시")
    println("===============================")
    homeTheaterLights.endMovie()
}