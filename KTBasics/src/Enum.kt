enum class Direcciones {
    NORTE, SUR, ESTE, OESTE
}

fun main(args: Array<String>) {
    var direccionUsuario = Direcciones.SUR

    if(direccionUsuario == Direcciones.NORTE){
        println("Yendo al Sur")
    } else {
        println("Direccion desconocida")
    }
}