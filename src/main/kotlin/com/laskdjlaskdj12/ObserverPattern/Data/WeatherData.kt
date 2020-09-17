package com.laskdjlaskdj12.ObserverPattern.Data

import com.laskdjlaskdj12.ObserverPattern.Observer
import com.laskdjlaskdj12.ObserverPattern.Subject

class WeatherData : Subject {
    val observers = ArrayList<Observer>()

    private fun getPressure(): Float {
        return 400F
    }

    private fun getHumidity(): Float {
        return 10F
    }

    private fun getTemperature(): Float {
        return 24.1F
    }

    //observer가 Observer 임을 느슨하게 결합되어있는 디자인으로 제공받는다.
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        if (observers.contains(observer)) observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach { it.update(getTemperature(), getHumidity(), getPressure()) }
    }
}