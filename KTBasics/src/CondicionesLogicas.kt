fun main(args: Array<String>) {
    var n:Int = 11

    // Operador AND
    println(n > 5 && n < 10) // false
    println(n > 5 && n > 10) // true

    // Operador OR
    println(n < 5 || n < 10) // false
    println(n > 5 || n < 10) // true

    var bool: Boolean = true
    println("Valor es: ${!bool}") // Imprime false
}