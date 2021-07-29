fun media2(vararg notas: Float){
    if(notas.isNotEmpty()){
        var soma = 0f
        for (nota in notas){
            soma += nota
        }
        println("A média é : ${soma/notas.size}")
    }
}

fun <T> media(vararg valores: T){
    //Reconhece qualquer tipo de dado
    for(valor in valores) {
        println(valor)
    }
}

fun main() {
    media(5f,10f,15f,20f,25f,30f)

    val str = "lorem ipsum"
    str.capitalize()
    str.decapitalize()
    str.contains("lor")
    str.startsWith("l")

    arrayOf(1,2,3,4,5,6 )
}