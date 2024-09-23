package Ejercicios.Cafetera



object cafetera_completa {

    private var agua = 400
    private var cafe = 100
    private var leche = 200
    private var vasos = 9
    private var DineroGuardado = 550


    @JvmStatic
    fun main(args: Array<String>) {
        println("La cafetera está prendida o apagada?")
        CafeteraPrendida(readLine()!!.toString().trim())
    }

    private fun CafeteraPrendida(estado: String) {
        if (estado == "prendida") {
            println("La cafetera está prendida, ¿qué desea hacer ya que me levanto?")

            while (true) {
                println("Escribe la acción a realizar (buy, fill, take, store, exit):")
                val accion = readLine()!!.toString().trim()

                if (accion == "exit") {
                    try {
                        println("Apagando el sistema...")
                        Thread.sleep(2000)
                        println("Voy a seguir durmiendo, no me molesten.")
                        break
                    } catch (e: Exception) {
                        println("Error en el sistema")
                    }
                }

                when (accion) {
                    "buy" -> comprarCafe()
                    "fill" -> reponerSuministros()
                    "take" -> retirarDinero()
                    "store" -> mostrarEstado()
                    else -> println("Acción no válida.")
                }
            }
        } else {
            println("Pues bueno, sigamos durmiendo zzZZZ")
        }
    }

    private fun comprarCafe() {
        println("¿Qué café quiere mi amigaso, espresso, latte o cappuccino?")
        val tipoCafe = readLine()!!.toString().trim()
        when (tipoCafe) {
            "espresso" -> procesarCompra(250, 0, 16, 4) // espresso
            "latte" -> procesarCompra(350, 75, 20, 7) // café con leche
            "cappuccino" -> procesarCompra(200, 100, 12, 6) // capuchino
            else -> println("Amigaso, ese café no lo tenemos acá, vaya para otro lado.")
        }
    }  private fun procesarCompra(aguaRequerida: Int, lecheRequerida: Int, cafeRequerido: Int, precio: Int) {
        if (agua >= aguaRequerida && leche >= lecheRequerida && cafe >= cafeRequerido && vasos > 0) {
            agua -= aguaRequerida
            leche -= lecheRequerida
            cafe -= cafeRequerido
            vasos--
            DineroGuardado += precio
            try {
                preparandoCafe()
            } catch (e: Exception) {
                println("Error en el sistema")
            }
        } else {
            println("No hay suficientes suministros para realizar la compra.")
        }
    }

    private fun reponerSuministros() {
        println("Escribe cuánta agua quieres añadir:")
        agua += readLine()!!.toInt()
        println("Escribe cuánta leche quieres añadir:")
        leche += readLine()!!.toInt()
        println("Escribe cuánto café quieres añadir:")
        cafe += readLine()!!.toInt()
        println("Escribe cuántos vasos quieres añadir:")
        vasos += readLine()!!.toInt()


        try {
            println("Procesando...")
            Thread.sleep(2000)
            println("¡Suministros reabastecidos!")
        } catch (e: Exception) {
            println("Error en el sistema")
        }
    }

    private fun retirarDinero() {
        try {
            println("Procesando...")
            Thread.sleep(2000)
        } catch (e: Exception) {
            println("Error en el sistema")
        }
        println("Retirando \$$DineroGuardado")
        println("No cele olvide pagarle a developer por su trabajo")
        DineroGuardado = 0
    }

    private fun mostrarEstado() {
        println("La máquina de café tiene:")
        println("$agua ml de agua")
        println("$leche ml de leche")
        println("$cafe g de café")
        println("$vasos vasos desechables")
        println("\$$DineroGuardado en efectivo")
    }

    private fun preparandoCafe() {
        // Aquí puedes implementar el proceso de preparación del café
        println("Preparando café...")
        CoffeeMachine1.preparandoCafe()
        try {

        } catch (e: InterruptedException) {
            println("Error en el sistema")
        }
        println("Café listo.")
    }

}