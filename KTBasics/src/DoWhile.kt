fun main(args: Array<String>) {
    var contador = 1

    do{
        println("Hola mundo ${contador}")
        for(item2 in 1..5){
            println("Coordenadas ${contador}, ${item2}")
        }
        contador++
    } while((contador <= 5))
}