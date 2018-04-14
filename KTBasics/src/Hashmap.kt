fun main(args: Array<String>) {
    var map = HashMap<Int, String>()

    //Coloca valores en el mapa
    map.put(1, "Jose")
    map.put(2, "Roberto")
    map.put(3, "Almaraz")

    //Obtiene e imprime el valor de la llave
    print(map.get(1))

    //Imprime todos los valores de un Hashmap
    for(item in map.keys){
        println(map.get(item))
    }
}