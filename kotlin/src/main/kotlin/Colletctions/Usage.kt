package Colletctions


data class Food(val name: String, val calories: Double, val ingredientes: List<Ingredientes> = listOf())

data class Ingredientes(val name: String, val quantity: Int)

fun hasInfredient(list: List<Ingredientes>, name: String) : Boolean{
    return list.filter { it.name == name}.any()
    //retorna se possui determinado nome na lista
}

fun main() {
    val data = listOf(
        Food(
            "Lasanha", 1200.0,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de Tomate", 2),
                Ingredientes("Manjericão", 3)
            )
        ),

        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de Feijão", 300.0),
        Food(
            "Hamburguer", 2200.0,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 2),
                Ingredientes("Alface", 3),
                Ingredientes("Tomate", 1),
                Ingredientes("Farinha", 1)
            )
        ),
    )
    //Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "Sim" else "nao"}.")

    //Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas")

    //Qual a primeira e última receita?
    println("Primeira receita é: ${data.first().name} ")
    println("Última receita é: ${data.last().name} ")

    //Qual a soma das calorias
    val sumCalories = data.sumByDouble { it.calories }
    println("A soma de calorias é: $sumCalories")

    //Me dê suas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.name}")
    }

    //Sei como fazer panqueca? E Sushi?
    val knowPancake = data.filter { it.name == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPancake) "sim" else "não"}")
    val knowSushi = data.filter { it.name == "Sushi" }.any()
    println("Sei fazer Suhi? ${if (knowSushi) "sim" else "não"}")

    //Quais as comidas com mais de 500 calorias?
    val more500 = data.filter { it.calories > 500 }.forEach { println(it.name) }

    //Par (chave, valor) de comidas com mais de 500 calorias (name, calories)
    data.filter { it.calories > 500 }.map { Pair(it.name, it.calories) }
        .forEach { println("${it.first}: ${it.second} calorias") }

    //Quais das receitas possui farinha como ingrediente?
    val result = data.filter { hasInfredient(it.ingredientes, "Farinha")}.forEach({println(it.name)})

}