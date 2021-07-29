package Colletctions

fun main(args :Array<String>) {

    val lista01 = listOf("Madrid", "São Paulo", "Torres")
    val lista02 = mutableListOf("Madrid", "São Paulo", "Torres")
    //esse mutable permite usar métodos como add e outros, o lsitOf não
    val array01 = arrayListOf("Madrid", "São Paulo", "Torres")
    //ArrayList
    val set01 = setOf("Madrid", "São Paulo", "Torres", "Torres")
    //setOf confere se tem repetido, e não contabiliza ele
    val set02 = mutableSetOf("Madrid", "São Paulo", "Torres", "Torres")


    val hash01 = hashMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))
    //tem as propriedades do Map do Java


    val map1 = mapOf(Pair("key", "value"), Pair("França", "Paris"))
    val map2 = mutableMapOf(Pair("key", "value"), Pair("França", "Paris"))
}