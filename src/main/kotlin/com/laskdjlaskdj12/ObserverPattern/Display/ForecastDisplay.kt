package com.laskdjlaskdj12.ObserverPattern.Display

import com.laskdjlaskdj12.ObserverPattern.DisplayElement
import com.laskdjlaskdj12.ObserverPattern.Observer

class ForecastDisplay : Observer, DisplayElement {
    private var temp:Float = 0.0F
    private var humidity:Float = 0.0F
    private var pressure:Float = 0.0F

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure

        display()
    }

    override fun display() {
        println("[ForecastDisplay] temp : $temp humidity : $humidity pressure : $pressure")
    }
}
