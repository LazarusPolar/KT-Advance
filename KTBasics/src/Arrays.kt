fun main(args: Array<String>) {

    var array = Array<Int>(5){0}
    array[3] = 55

    println("Array[3] ${array[3]}")

    println("Imprimir todos los elementos")

    // Primer forma de imprimir valores
    for(element in array){
        println(element)
    }

    // Segunda forma de imprimir valores
    for(element in 0..4){
        println(array[element])
    }

    var arraySrt = Array<String>(4){""}
    for(index in 0..3){
        print("Ingresa el elemento $index")
        arraySrt[index] = readLine()!!
    }

    for(index in 0..3){
        print("Elemento $index : ${arraySrt[index]}")
    }
}