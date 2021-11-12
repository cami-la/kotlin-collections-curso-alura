package br.com.alura.test

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
