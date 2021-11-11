package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )

    /*val valorPedido: Double? = pedidos.getValue(5)
    println(valorPedido)*/

    val mensagem = pedidos.getOrElse(1, { "Não tem o pedido" })
    println(mensagem)

    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for(numerosdePedido in pedidos.keys) {
        print("Pedido $numerosdePedido ")
    }
    println()
    for(valorDoPedido in pedidos.values) {
        print("Valor $valorDoPedido ")
    }

    pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50}

    println(pedidos.values)



}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)

    val pedido: Double? = pedidos[4]

    pedido?.let {
        println("pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Numero do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}


