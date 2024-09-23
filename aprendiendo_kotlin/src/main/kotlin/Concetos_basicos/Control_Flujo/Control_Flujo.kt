package Concetos_basicos.Control_Flujo


fun main(){
   println("intresa un numero")
    val a = readLine()!!.toInt()
    val instaciaControl_Flujo = Control_Flujo(a)
    instaciaControl_Flujo.imprimir()
    println("intresa un numero de la semana del 1 a 7")
    val b = readLine()!!.toInt()
    val instaciaDia = dia_De_la_semana(b)
    instaciaDia.imprimirSemana()
}
 //Control de Flujo
 //Condicionales: if, when (similar a switch en otros lenguajes).
 //Bucles: for, while, y do while.
class Control_Flujo(val a: Int){
    fun imprimir(){
        if(a % 2== 0){
        println("$a es par")
        } else{
        println("$a es impar")
    }}

}

class dia_De_la_semana(val a:Int){
    fun imprimirSemana(){
        when (a){
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miercoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sabado")
            7 -> println ("Domingo")
            else -> println("No es un dia de la semana")
        }

    }
}