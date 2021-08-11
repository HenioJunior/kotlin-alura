package br.com.alura.kotlin.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}