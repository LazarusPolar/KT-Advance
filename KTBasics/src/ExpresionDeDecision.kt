fun main(args: Array<String>) {
    var numero1 = 10
    var numero2 = 20
    var max : Int?

    /*
    if(numero1 > numero2){
        max = numero1
    } else {
        max = numero2
    }
    */

    //Equivale a

    max = if(numero1 > numero2) numero1 else numero2

    println("Imprimer numero maximo: $max")


    // When

    var edad = 31

    var esJoven = when(edad){
        30 -> false
        else -> true
    }

    println("¿Es joven?: $esJoven")
}