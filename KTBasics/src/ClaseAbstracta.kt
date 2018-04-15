abstract class Credito() {
    fun creditoId():String {
        return "23123123"
    }

    abstract fun nuevoCredito()
}

class InfoUsusario(): Credito() {
    override fun nuevoCredito() {
        println("Nuevo Credito")
    }

    fun obtieneInfo():String {
        return creditoId()
    }

}

fun main(args: Array<String>) {

    // No funciona si se agrega abstract. Debe implementarse la clase abstracta en otra clase
    // En donde sus funciones y variables puedan ser obtenidas y manipuladas
    // En el clase de la clase abstracta tenga funciones abstractas. Una vez que una de las clases implemente
    // dicha clase abstracta, podra modifcar la funcion abstracta declarando el modificador "override"
    //
    /*
    var credito = Credito()
    println("Credito: ${credito.creditoId()}")
    */

    var usuarioInfo = InfoUsusario()
    println(usuarioInfo.obtieneInfo())
    usuarioInfo.nuevoCredito()
}