abstract class Mamifero(var nome: String){

    var peso: Float = 0f

    abstract fun falar()
    fun dormir(){
        println("estou dormindo")
    }
}

class cachoro(nome: String, peso: Float ) : Mamifero(nome){

    init {
        this.peso = peso
    }

    override fun falar() {
        println("au au")
    }
}
class gato(nome: String) : Mamifero(nome){
    override fun falar() {
        println("miau miau")
    }

}

fun main() {
    //cachoro("Bolt").dormir()
}