package br.com.alura.test

fun testaSet() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria"
    )

    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf(
        "Alex",
        "Paulo",
        "Maria"
    )

    //val assistiramAmbos: Set<String> = assistiramCursoAndroid.plus(assistiramCursoKotlin)

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println("Assistiram ambos: ${assistiramAmbos.distinct()}")

    //println(assistiramAmbos[0])

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin.plus(assistiramCursoAndroid))
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList: MutableList<String> = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)

    println(assistiramList.toSet())
}
