fun main(args: Array<String>) {

    println("Ingresa tu calificacion: ")
    var calificacion = readLine()!!.toDouble()

    if (calificacion >= 9){
        println("Tu calificacion es excelente")
    } else {
        println("Tu calificacion no es excelente")
    }

    println("Introdujiste tu calificacion: $calificacion")
}