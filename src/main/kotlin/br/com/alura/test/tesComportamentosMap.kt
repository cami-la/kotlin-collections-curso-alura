package br.com.alura.test

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

    /*val valorPedido: Double? = pedidos.getValue(5)
    println(valorPedido)*/

    val mensagem = pedidos.getOrElse(1, { "Não tem o pedido" })
    println(mensagem)

    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    /*for(numerosdePedido in pedidos.keys) {
        print("Pedido $numerosdePedido ")
    }
    println()
    for(valorDoPedido in pedidos.values) {
        print("Valor $valorDoPedido ")
    }*/

    val pedidosFiltrados = pedidos.filter { (numero, valor) -> numero % 2 == 0 && valor > 50 }

    println(pedidos.values)
    println(pedidosFiltrados)

    val valorPedidosAcima: Map<Int, Double> = pedidos.filterValues { valor -> valor > 70 }
    println(valorPedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero -> numero % 2 == 0 }
    println(pedidosPares)

    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - 6)
    println(pedidos - listOf(6, 5))
    println(pedidos)

    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0))
    println(pedidos)

    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 30.0))
    println(pedidos)

    pedidos += (setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 9 to 40.0))
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}
