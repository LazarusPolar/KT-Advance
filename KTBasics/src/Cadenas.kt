fun main(args: Array<String>) {
    var titulo = "Bienvenido a la ciudad"
    println(titulo)
    println("Hola: " + titulo)
    println("Hola: $titulo")

    var nombre = "Roberto" + "Jose"
    println("Nombre: $nombre")
    println("Segundo caracter:" + titulo[1]) // Para recuperar caracteres
    println("A minusculas:" + titulo.toLowerCase()) // Para recuperar en minusculas
    println("A mayusculas:" + titulo.toUpperCase()) // Para recuperar en mayusculas
    println("A minusculas:" + titulo.split(" ")) // Para recuperar cadenas separadas por el valor especificado
    println("A quitar espacios de la cadena:" + titulo.trim()) // Remueve espacios en los bordes de la cadena
}