class Quadrado(val area: Float){
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}

data class Triangulo(val area: Float)

/*data class Param(var b: Boolean, var s: String,var i: Int)
fun teste(p: Param){
Param(false, "",10)
}*/

    fun main(){
        val q1 = Quadrado(10f)
        val q2 = Quadrado(20f)
        val t1 = Quadrado(10f)
        val t2 = Quadrado(20f)

    }
