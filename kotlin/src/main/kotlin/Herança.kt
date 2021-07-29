open class Maquina2(val marca: String) {
    open fun minhaMaquina() {
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina2(marca) {

    //override
    override fun minhaMaquina() {
        "Estou reescrevendo minha marca!"
    }
    //overload é uma sobrecarga, com função com mesmo nome
    //e com um ou mais assinatura igual
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 1")

    fun ligar() {}
    fun desligar() {}
}

fun main() {
    val c: Computador = Computador("xpto", 10)
    with(c) {
        ligar()
        desligar()
    }
}
