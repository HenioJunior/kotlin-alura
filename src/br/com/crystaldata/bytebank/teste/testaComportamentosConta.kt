import br.com.crystaldata.bytebank.exception.SaldoInsuficienteException
import br.com.crystaldata.bytebank.modelo.Cliente
import br.com.crystaldata.bytebank.modelo.ContaCorrente
import br.com.crystaldata.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha =  1)

    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente("Fran", "222.222.222-22", senha = 2)

    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(250.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(370.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(270.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(149.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(270.0)
    println(contaFran.saldo)

    println("--------Saldo atualizado----------")
    println(contaAlex.saldo)
    println(contaFran.saldo)
    println()

    println("Transferência da conta da Fran para o Alex")
    try {
        contaFran.transfere(destino = contaAlex, valor = 131.0)
        println("Transferência sucedida")

    }catch(e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    }
    println()
    println(contaAlex.saldo)
    println(contaFran.saldo)
}