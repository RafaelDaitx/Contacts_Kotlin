
class Maquina (var marca: String){

    var nucleos: Int = 0
        get() {
            println("Get foi chamado")
            return field
        }
        set(value) {
            println("Set Foi chamado")
            field = value
        }

    fun ligar(){

    }

    fun processar(){

    }

    fun desligar(){

    }
}

fun main() {
    var m = Maquina("xpto")
    with(m){
        ligar()
        processar()
        desligar()
        //com o with, chama varios métodos com a
        //mesma variavel
    }
    m.ligar()
    m.processar()
    m.desligar()
}
