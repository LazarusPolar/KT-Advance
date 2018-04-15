open class Operaciones1() {
    public var nombreProceso: String? = null
    // protected - Pueden verla en la clase y los que heredan
    // private - Solo puede verlo la clase de origen

    // Para realizar un override, la funcion debe tener el modificador open
    open fun suma(n1: Int, n2: Int): Int{
        return n1+n2
    }

    fun dividir(n1:Int, n2:Int): Int {
        return n1/n2
    }
}

// Herada las funciones de la clase Operaciones
// Nota: siempre colocar open a la clase a la que se hereda ya que, sin ello, no se permitira dicha herencia
class Mutltioperaciones1:Operaciones1 {

    // Forma de heredar clases incluyendo "constructor"
    constructor(): super(){}

    // Se sobrecarga la funcion y puede modificarse su valor de retorno
    override fun suma(n1: Int, n2: Int): Int{
        // Super toma la funcion de la funcion padre de la que hereda
        super.suma(n1, n2)
        return n1+n2*3
    }

    fun resta(n1: Int, n2: Int): Int{
        return n1-n2
    }

    fun multiplicacion(n1:Int, n2:Int): Int {
        return n1*n2
    }

    fun obtieneNombre() {
        super.nombreProceso
    }
}

fun main(args: Array<String>) {
    var op = Operaciones1()
    var suma = op.suma(1,2)
    println("Imprime Suma: $suma")

    var dividir = op.dividir(1, 2)
    println("Imprime Division $dividir")

    // Castind de valor con modificador "as Operaciones1"
    var op2 = Mutltioperaciones1() as Operaciones1
    var suma1 = op2.suma(1,2)
    println("Imprime Suma: $suma1")

    var dividi1r = op2.dividir(1, 2)
    println("Imprime Division $dividi1r")

    println("op.nombreProceso: ${op.nombreProceso}")
}