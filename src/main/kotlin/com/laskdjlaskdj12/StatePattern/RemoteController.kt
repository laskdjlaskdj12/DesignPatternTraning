package com.laskdjlaskdj12.StatePattern

class RemoteController {

    var button:IButton? = null

    fun registerButton(button:IButton){ this.button = button }

    fun push(){ button?.push()}
}
