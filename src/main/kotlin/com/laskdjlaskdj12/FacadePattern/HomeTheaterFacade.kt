package com.laskdjlaskdj12.FacadePattern

class HomeTheaterFacade(
    private val amplifier: Amplifier,
    private val tuner: Tuner,
    private val dvd: DvdPlayer,
    private val projector: Projector,
    private val lights: TheaterLights,
    private val popper: PopcornPopper
) {
    fun watchMovie(name: String) {
        amplifier.on()
        tuner.on()
        projector.on()
        popper.on()

        projector.wideScreen()
        lights.setLight(100)
        amplifier.setDvd(dvd)
        popper.pop()

        dvd.on()
        dvd.play(name)
    }

    fun endMovie() {
        dvd.stop()
        dvd.eject()
        dvd.off()

        lights.setLight(10)

        amplifier.off()
        tuner.off()
        projector.off()
        popper.off()
    }
}
