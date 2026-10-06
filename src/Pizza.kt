class Pizza(
    val sabor: String,
    val tamanho: Int // 1 = Pequena, 2 = Média, 3 = Grande
) {
    // Regra 3: o tamanho define o preço base (when)
    val precoBase: Double = when (tamanho) {
        1 -> 35.0
        2 -> 50.0
        3 -> 65.0
        else -> 0.0
    }

    val nomeTamanho: String = when (tamanho) {
        1 -> "Pequena"
        2 -> "Média"
        3 -> "Grande"
        else -> "Inválido"
    }

    fun tamanhoValido(): Boolean = tamanho in 1..3
}
