package br.com.crystaldata.bytebank

import br.com.alura.kotlin.exception.SaldoInsuficienteException

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e : br.com.alura.kotlin.exception.SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw br.com.alura.kotlin.exception.SaldoInsuficienteException()
    }
    println("fim funcao2")
}