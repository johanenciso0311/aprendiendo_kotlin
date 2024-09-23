package Concetos_basicos.variables


fun main()  {
    // val
    //Inmutable: Se utiliza para declarar variables de solo lectura,
    // lo que significa que no se pueden reasignar después de su inicialización.
    val instaciaVariables = tipo_variables()

    val sumarinstacia = sumar(5, 10)
    val resultado = sumarinstacia.sumar()
    println("Nombre: ${instaciaVariables.nombre}")
    println("suma 5 + 10 = $resultado")
}
class tipo_variables {
    // var
    //Mutable: Permite declarar variables que pueden ser reasignadas,
    // es decir, puedes cambiar su valor en cualquier momento.
    var nombre = "Juan"
    var edad = 25
    var altura = 1.75
    var peso = 75.5
    var casado = false
    var sexo = 'M'
    var fechaNacimiento = "1995-01-01"
    var direccion = "Calle 123"
    var telefono = "1234567890"
    var email = ""

}

class sumar(val a: Int, val b: Int){
    // 2. Tipos de Datos
   // Kotlin tiene tipos de datos básicos como Int, Double, Boolean, String, etc.
   // Soporta tipos nulos usando el operador ? para indicar que una variable puede ser nula.
   // Ejemplo:
    fun sumar(): Int {
       return a + b
    }
}