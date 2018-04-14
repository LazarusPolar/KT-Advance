fun muestraMensaje(nombre: String): Unit {
    print("Nombre $nombre")
}

fun muestraMensaje(numero: Int): Unit {
    print("Numero $numero")
}

fun muestraMensaje(numero: Double): Unit {
    print("Numero $numero")
}

fun main(args: Array<String>) {
    muestraMensaje("Hola")
    muestraMensaje(1)
    muestraMensaje(1.1)
}