// Se agrega var para obtener los valores con get
class Carro() {

    var tipo: String? = null
    var modelo: Int? = null
    var precio: Double? = null
    var millasConducidas:Int? = null
    var duenio:String? = null

    //Se puede tener mas de un constructor para llamar a la clase e inicializar valores 
    constructor(tipo: String, modelo: Int, precio: Double, millasConducidas:Int, duenio:String):this(){
        this.tipo = tipo
        this.modelo = modelo
        this.precio = precio
        this.millasConducidas = millasConducidas
        this.duenio = duenio
    }

    constructor(duenio: String):this(){
        this.duenio = duenio
        println("Constructor dueño: $duenio")
    }

    // Corre automaticamente cuando se inicializa la clase
    init {
        println("Se invoca la clase. Tipo $tipo")
        println("Se invoca la clase. Tipo $modelo")
        println("Se invoca la clase. Tipo $precio")
        println("Se invoca la clase. Tipo $millasConducidas")
        println("Se invoca la clase. Tipo $duenio")
    }

    fun obtenerPrecio(): Double {
        return this.precio!! - (this.millasConducidas!!.toDouble() * 10)
    }


}

fun main(args: Array<String>) {
    val carro = Carro("BMW", 2015, 10000.50, 103, "Jose")
    println("Precio de automovil ${carro.obtenerPrecio()}")

    val carro2 = Carro("Nissan", 23, 1232.2, 213, "Lucia")

    val carro3 = Carro("Roberto")
}