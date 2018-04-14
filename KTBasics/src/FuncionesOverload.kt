// Funcion que se sobrecarga con diferentes parametros

fun suma(n1: Int, n2: Int):Int {
    return n1+n2
}

fun suma(n1: Int, n2: Int, n3: Int):Int {
    return n1+n2+n3
}

fun suma(n1: Int, n2: Int, n3: Int, n4: Int):Int {
    return n1+n2+n3+n4
}


fun main(args: Array<String>) {
    var suma1 = suma(1,2)
    println("Resultado $suma1")

    var suma2 = suma(1,2,3)
    println("Resultado $suma2")

    var suma3 = suma(1,2,3, 4)
    println("Resultado $suma3")
}