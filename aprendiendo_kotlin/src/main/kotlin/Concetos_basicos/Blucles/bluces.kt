package Concetos_basicos.Blucles

fun main(){

    println("mi primero bluce")
    val numero = readLine()!!.toInt()
    val instaciaBlucles = bluces(numero)
    instaciaBlucles.bluces()
    println("mi segundo bluce")
    val numero2 = readLine()!!.toInt()
    val instaciaMultiplicar = Multiplicar(numero2)
    instaciaMultiplicar.multiplicar()
    println("mi tercer bluce")
    val numero3 = readLine()!!.toInt()
    val instaciaWhile = elseñorWhile()
    instaciaWhile.while1()
    println("mi cuarto bluce")
    val numero4 = readLine()!!.toInt()
    val instaciaDoWhile = elSeñoryLaSeñorado(numero4)
    instaciaDoWhile.doWhile()


}

class bluces(val a: Int){
    var suma = 0
    fun bluces(){
        for (i in 1..a){
            println("numero $i")
            suma += i
        }
        println("la suma de los numeros es $suma")
    }
}
class Multiplicar(val a: Int){

    fun multiplicar() {
        for (i in 1..a) {
            println("$a x $i = ${a * i}")
        }

    }
}


class elseñorWhile(){
    fun while1(){
        var i = 1
        while (i <= 10){
            println("numero $i")
            i++
        }
    }
}

class elSeñoryLaSeñorado(val a: Int){
    fun doWhile(){
        var i = 1
        do {
            println("numero $i")
            i++
        }while (i <= a)
    }
}