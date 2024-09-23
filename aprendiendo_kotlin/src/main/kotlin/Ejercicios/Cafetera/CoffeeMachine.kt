package Ejercicios.Cafetera

object CoffeeMachine1 {

    @JvmStatic
    fun main(args: Array<String>) {

        println("¿Deseas pedir un café?")
        val response = readLine().toString()

        if (response == "yes") {
            preparandoCafe()
        } else {
            println("¡Ok, adiós!")
        }


    }

    public fun preparandoCafe() {
        try {
            println("Iniciando la preparación del café")
            Thread.sleep(2000)
            mostrarPreparando()
            println("Moliendo granos de café")
            Thread.sleep(2000)
            mostrarPreparando()
            println("Hirviendo agua")
            Thread.sleep(2000)
            mostrarPreparando()
            println("Mezclando agua hirviendo con café molido")
            Thread.sleep(2000)
            mostrarPreparando()
            println("Sirviendo café en la taza")
            Thread.sleep(2000)
            mostrarPreparando()
            println("Agregando un poco de leche en la taza")
            Thread.sleep(2000)
            mostrarPreparando()
            println("¡El café está listo!")
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            println("¡Ups! ¡Se nos acabó el café!")
        }
    }

    public fun mostrarPreparando() {
        print("... Preparando...\r")
        Thread.sleep(2000)
        print("\r")
    }

}