fun main() {
    val pizza = Pizza(sabor = "Calabresa", tamanho = 3)

    if (!pizza.tamanhoValido()) {
        println("Tamanho inválido! Escolha 1, 2 ou 3.")
        return
    }

    val extras = listOf(
        Ingrediente("Bacon", 6.0),
        Ingrediente("Catupiry", 5.5),
        Ingrediente("Azeitona", 3.0)
    )

    // Pedido 1: terça-feira, com borda recheada
    val pedido1 = PedidoPizzaria(
        pizza = pizza,
        ingredientesExtras = extras,
        bordaRecheada = "Catupiry",
        ehTerca = true
    )
    pedido1.exibirResumo()

    println()

    // Pedido 2: dia comum, sem borda (null) e sem extras
    val pedido2 = PedidoPizzaria(
        pizza = Pizza("Mussarela", 1),
        ingredientesExtras = emptyList(),
        bordaRecheada = null,
        ehTerca = false
    )
    pedido2.exibirResumo()
}
