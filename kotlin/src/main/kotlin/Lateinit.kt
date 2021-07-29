class Pessoa{
    lateinit var nome: String

    fun geradorDeNome(){
        nome = "rafael"
    }
}

fun main() {
    val p = Pessoa()
        p.geradorDeNome()

}