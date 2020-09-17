package com.laskdjlaskdj12.StatePattern

fun main(){
    val remoteController = RemoteController()
    remoteController.registerButton(ComputerButton())
    remoteController.registerButton(TvButton())
    remoteController.push()
}