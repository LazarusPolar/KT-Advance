fun main(args: Array<String>){

    // Datos
    println("Ingresa tu nombre: ")
    var nombre: String? = readLine()
    println("Ingresa tu edad: ")
    var edad: Int = readLine()!!.toInt()
    println("Ingresa tu departamento asignado: ")
    var departamento: String? = readLine()
    println("Ingresa tu constante: ")
    var PI: Double = readLine()!!.toDouble()

    println("Asignacion: $nombre, Edad: $edad, Asignado: $departamento, Constante: $PI")

}