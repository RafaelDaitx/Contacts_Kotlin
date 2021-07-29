package Exception

fun main() {

    try {
        println("sdkg".toInt())
    } catch (e: NumberFormatException) {
        println("Esse valor não é um número")
    } catch (e: Exception) {
        println("Algo de errado aconteceu")
    } finally {
        println("Encerrou")
    }
    //Try catch pode ser usado para reconhecer um possível erro,
   // ele vai cair no primeiro exception colocado
    //finally executa o comando no final SEMPRE
}