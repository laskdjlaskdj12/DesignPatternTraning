package com.laskdjlaskdj12.StatePattern

import com.laskdjlaskdj12.StatePattern.Button.ComputerButton
import com.laskdjlaskdj12.StatePattern.Button.TvButton
import com.laskdjlaskdj12.StatePattern.Controller.RemoteController

fun main(){
    val remoteController = RemoteController()
    remoteController.registerButton(ComputerButton())
    remoteController.registerButton(TvButton())
    remoteController.push()
}