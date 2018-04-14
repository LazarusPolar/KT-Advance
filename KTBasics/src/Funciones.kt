fun suma(x: Double, y: Double): Double{
    return x + y
}

//Tipo de retorno Unit es equivalente a "Void"
fun muestraResultado(resultado: Double): Unit{
    println("resultado: $resultado")
}

fun saludo(): Unit {
    println("Saludos")
}

fun main(args: Array<String>) {
    saludo()
    var resultado = suma(1.1,1.2)
    muestraResultado(resultado)
}