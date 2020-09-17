package com.laskdjlaskdj12.StatePattern.Controller

import com.laskdjlaskdj12.StatePattern.Button.IButton

class RemoteController {

    var button: IButton? = null

    fun registerButton(button: IButton){ this.button = button }

    fun push(){ button?.push()}
}
