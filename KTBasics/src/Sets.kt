fun main(args: Array<String>) {
    // SetOf es un valor inmutable
    // Estructura que no repite valores que tiene dentro de la misma
    var set1 = setOf(1,12,1312,12312,213,123, 12)

    for(element in set1){
        println(element)
    }

    // SetOf es un valor mutable
    // Estructura que no repite valores que tiene dentro de la misma
    var set2 = mutableSetOf(1,12,1312,12312,213,123, 12)
    set2.add(23)

    for(element in set2){
        println(element)
    }

}