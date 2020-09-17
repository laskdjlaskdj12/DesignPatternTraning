package com.laskdjlaskdj12.ObserverPattern

import com.laskdjlaskdj12.ObserverPattern.Data.WeatherData
import com.laskdjlaskdj12.ObserverPattern.Display.CurrentCondirionsDisplay
import com.laskdjlaskdj12.ObserverPattern.Display.ForecastDisplay
import com.laskdjlaskdj12.ObserverPattern.Display.StaticDisplay

fun main(){
    val weatherData = WeatherData()
    weatherData.registerObserver(CurrentCondirionsDisplay())
    weatherData.registerObserver(StaticDisplay())
    weatherData.registerObserver(ForecastDisplay())
    weatherData.notifyObservers()
}