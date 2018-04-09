fun main(args: Array<String>){

    var numero1: Int = 10
    var numero2: Int?
    var numero2Cadena: String = "22"

    // Conversion de String a Int
    numero2 = numero2Cadena.toInt()

    var numero2Float: Float?
    numero2Float = numero2.toFloat()

    println("Primer numero: $numero1")
    println("Numero convertido String: $numero2")
    println("Numero convertido Double: $numero2Float" )

    var xPi:  Double = 3.14
    println("Valor PI: $xPi")

    // Solo imprime la parte entera despues de la conversion del dato
    var intPi: Int = xPi.toInt()
    println("Valor PI Entero: $intPi")
}