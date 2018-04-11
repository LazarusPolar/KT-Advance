fun main(args: Array<String>) {
    loop@ for (cuenta in 1..10) {
        for (cuenta2 in 1..5) {
            if (cuenta == 2) {
                // continue - Continua el ciclo
                break@loop // Rompe el ciclo en donde se encuentre y continue y deja de imprimir. Con el @loop especifica que loop desea romperse
            }
            println("Cuenta $cuenta")
        }
    }
}