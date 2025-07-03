package com.hernandez.cristian.cazarpatos

data class Player (var username:String, var huntedDucks:Int){
    constructor():this("",0) // Constructor para inicializar las variables en el caso que no estan creados y nop se cuelgue la app
}