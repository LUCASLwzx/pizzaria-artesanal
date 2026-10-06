class PedidoPizzaria(
    val pizza: Pizza,
    val ingredientesExtras: List<Ingrediente>,
    val bordaRecheada: String?, // Regra 4: opcional (nullable)
    val ehTerca: Boolean        // Regra 5: simulado por booleano
) {
    companion object {
        const val TAXA_BORDA = 9.0
        const val DESCONTO_TERCA = 0.10
    }

    // Regra 2: laço for somando os ingredientes adicionais
    fun calcularTotalIngredientes(): Double {
        var total = 0.0
        for (ingrediente in ingredientesExtras) {
            total += ingrediente.preco
        }
        return total
    }

    // Regra 4: chamada segura (?.) + elvis (?:) -> nulo = custo zero
    fun calcularTaxaBorda(): Double {
        return bordaRecheada?.let { TAXA_BORDA } ?: 0.0
    }

    fun calcularSubtotal(): Double {
        return pizza.precoBase + calcularTotalIngredientes() + calcularTaxaBorda()
    }

    // Regra 5: promoção de terça (if/else) - 10% de desconto
    fun calcularDesconto(): Double {
        return if (ehTerca) {
            calcularSubtotal() * DESCONTO_TERCA
        } else {
            0.0
        }
    }

    fun calcularTotal(): Double = calcularSubtotal() - calcularDesconto()

    fun exibirResumo() {
        println("========== PEDIDO - PIZZARIA ARTESANAL ==========")
        println("Pizza: ${pizza.sabor} (${pizza.nomeTamanho})")
        println("Preço base: R$ %.2f".format(pizza.precoBase))

        if (ingredientesExtras.isEmpty()) {
            println("Ingredientes extras: nenhum")
        } else {
            println("Ingredientes extras:")
            for (ing in ingredientesExtras) {
                println("  + ${ing.nome} - R$ %.2f".format(ing.preco))
            }
        }

        println("Borda recheada: ${bordaRecheada ?: "Sem borda recheada"}")
        println("Taxa de borda: R$ %.2f".format(calcularTaxaBorda()))

        println("-------------------------------------------------")
        println("Subtotal: R$ %.2f".format(calcularSubtotal()))

        if (ehTerca) {
            println("Promoção de Terça (10%% OFF): - R$ %.2f".format(calcularDesconto()))
        } else {
            println("Promoção de Terça: não aplicável")
        }

        println("TOTAL: R$ %.2f".format(calcularTotal()))
        println("=================================================")
    }
}
