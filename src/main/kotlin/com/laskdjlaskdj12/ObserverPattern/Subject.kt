package com.laskdjlaskdj12.ObserverPattern


interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}