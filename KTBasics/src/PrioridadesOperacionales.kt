fun main(args: Array<String>) {
    var numero1: Int = 10
    var numero2: Int = 12
    var numero3: Int = 5
    var suma: Int?

    /*
    Reglas de prioridad operacional
    1 - ()
    2 - ^
    3 - * /
    4 - + -
    5 - = 
     */

    suma = (numero1 + numero2 + numero3) * 3

    print("Suma: $suma")
}