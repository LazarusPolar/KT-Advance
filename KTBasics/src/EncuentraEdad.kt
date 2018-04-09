import java.util.*

fun main(args: Array<String>) {

    // Entrada
    print("Ingresa tu Año de Nacimiento: ")
    var anioDeNacimiento = readLine()!!.toInt()

    // Proceso
    var anioCalendario = Calendar.getInstance().get(Calendar.YEAR)
    var edad = anioCalendario - anioDeNacimiento

    // Salida
    println("Tu edad es: $edad años")
}