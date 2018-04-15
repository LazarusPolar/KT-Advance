interface operacion {

    // Si no se incluye una implementacion, se toma la que se tiene declarada por defecto
    fun suma(n1: Int, n2: Int){
        print(n1+n2)
    }
    fun div(n1: Int, n2: Int){
        print(n1/n2)
    }
}

class OperacionesUsuario: operacion {
    override fun div(n1: Int, n2: Int) {
        print(n1/n2)
    }

    override fun suma(n1: Int, n2: Int) {
        println(n1+n2)
    }

}

class OperacionesAdmin: operacion {
    override fun div(n1: Int, n2: Int) {
        println(n1/n2*4)
    }

    override fun suma(n1: Int, n2: Int) {
        println(n1+n2-5)
    }
}

class OperacionesManager: operacion {

}

fun main(args: Array<String>) {
    var ops = OperacionesManager()
    ops.suma(1,2)

    var ops1 = OperacionesAdmin()
    ops1.suma(1,2)

    var ops2 = OperacionesUsuario()
    ops2.suma(1,2)

}