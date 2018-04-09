fun main(args: Array<String>) {
    println("Ingresa tu calificacion: ")
    var calificacion = readLine()!!.toDouble()

    if (calificacion >= 9){
        println("Tu calificacion es excelente")
    }

    if (calificacion>=5 && calificacion <= 7){
        println("Tu calificacion es media")
    }

    println("Introdujiste tu calificacion: $calificacion")
}