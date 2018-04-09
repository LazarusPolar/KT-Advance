fun main(args: Array<String>) {

    println("Ingresa tu calificacion: ")
    var calificacion = readLine()!!.toDouble()

    if (calificacion >= 9){
        println("Tu calificacion es excelente")
    } else if(calificacion >= 8 && calificacion < 9){
        println("Tu calificacion es buena")
    } else if(calificacion >= 7 && calificacion < 8){
        println("Tu calificacion es media")
    } else {
        println("Reprobaste la materia")
    }

    println("Introdujiste tu calificacion: $calificacion")
}