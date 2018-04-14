fun main(args: Array<String>) {
    // Ejemplo de hashMapOf
    var map = hashMapOf(1 to "Jose", 2 to "Almaraz")
    map.put(3, "Gonzalez")

    //Manera de obtencion de datos de hashMapOf
    println(map.get(2))
    println(map[3])

    // Ejemplo de ArrayOf
    var arr = arrayOf(1,10,20,30)

    // Maneras de obtencion de datos de ArrayOf
    println(arr[0])
    for(item in arr){
        println(arr[item])
    }

    // Ejemplo de listOf
    var list = listOf(11, 22, 33, 22)
    //list[0] = 22 - Imposible de hacer al ser inmutable

    var list1 = mutableListOf(11, 22, 33, 22)
    list1[0] = 22

}