fun main(args: Array<String>) {
    /*
    Reglas de prioridad operacional
    1 - ()
    2 - ++, -- (Antes de la variable)
    3 -
    4 - * /
    5 - + -
    6 - =
    7 - ++, -- (Despues de la variable)
     */

    var numero1: Int = 10
    var numero2: Int = 12
    // Incrementa/Decrementa antes de realizar la instruccion
    var numero3: Int = ++numero1 + numero2

    // Incrementa/Decrementa antes de realizar la instruccion
    // var numero3: Int = numero1++ + numero2

    print("Suma: $numero3")
}