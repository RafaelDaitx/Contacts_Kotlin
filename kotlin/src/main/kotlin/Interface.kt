interface Maquinario{
    fun ligar()
    fun desligar(){
        println("Desliguei")
    }
}

interface interface1{

}

interface interface2{

}

class implementaInterface : interface1, interface2{
    
}
class Computadores : Maquinario{
    override fun ligar() {
    }

    override fun desligar() {
        super.desligar()
    }
}

fun main() {

}