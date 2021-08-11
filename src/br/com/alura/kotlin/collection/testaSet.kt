package br.com.alura.kotlin.collection

class testaSet {
    fun testaSet() {
        val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
        val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
        val assistiramAmbos = mutableSetOf<String>()

        assistiramAmbos.addAll(assistiramCursoAndroid)
        println(assistiramAmbos)
        println()

        assistiramAmbos.addAll(assistiramCursoKotlin)
        println(assistiramAmbos)
        println()

        assistiramAmbos.add("Ana")
        assistiramAmbos.add("Ana")
        println(assistiramAmbos)
        println()

        println(assistiramCursoKotlin + assistiramCursoAndroid)
        println(assistiramCursoKotlin union assistiramCursoAndroid)

        println(assistiramCursoAndroid - assistiramCursoKotlin)
        println(assistiramCursoAndroid subtract assistiramCursoKotlin)

        println(assistiramCursoAndroid intersect assistiramCursoKotlin)

        val assistiramList = assistiramAmbos.toMutableList()
        assistiramList.add("Alex")
        println(assistiramList)
        println(assistiramList.toSet())
    }
}