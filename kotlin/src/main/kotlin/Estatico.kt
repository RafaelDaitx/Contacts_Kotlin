class Constantes {
    companion object{
        val TABLE = "Pessoa"
        fun teste(){
            println("Estatico")
        }
    }

    object  VENDAS {
        val TABLE_NAME = "PessoaS"

        object COLUNAS {
            val ID = "id"
            val TOTAL = "total"
        }
    }

}

fun main(){
    println(Constantes.TABLE)
    Constantes.teste()
    Constantes.VENDAS.COLUNAS 
}