package Polimorfismo

interface Funcionario{
    fun calculaBonus()
}

class  Gerente : Funcionario{
    override fun calculaBonus() {
        println("Bonus: 500")
    }


}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 200")
    }

}

class Analista : Funcionario{
    override fun calculaBonus() {

    }

}

fun main() {
    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()
    val f3: Funcionario = Analista()
    calculo(f1)
    calculo(f2)

}

fun calculo(funcionario: Funcionario){
    funcionario.calculaBonus()
}