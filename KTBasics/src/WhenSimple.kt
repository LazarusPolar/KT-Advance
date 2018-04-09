fun main(args: Array<String>) {
    var x: Int = 4

    // Estructura equivalente al Switch en otros lenguajes
    when(x){

        // Si cae dentro de los valores especificados
        1,2 -> {
            println("Valor es 1")
        }

        // Si cae dentro del rango especificado
        in 10..40 -> {
            println("Valor es 2")
        }

        // Si no cae dentro del rango especificado
        !in 10..40 -> {
            println("Valor es 3")
        }

        4 -> {
            println("Valor es 4")
        }

        5 -> {
            println("Valor es 5")
        }

        else -> {
            println("Valor no valido")
        }
    }
}