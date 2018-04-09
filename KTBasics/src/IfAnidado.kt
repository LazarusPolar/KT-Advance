fun main(args: Array<String>) {
    println("Ingresa tu calificacion: ")
    var calificacion = readLine()!!.toDouble()

    if (calificacion >= 9){
        if(calificacion >= 93){
            println("Tu calificacion es sobresaliente")
        } else {
            println("Tu calificacion es excelente")
        }
    }

    println("Introdujiste tu calificacion: $calificacion")
}