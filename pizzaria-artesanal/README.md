# 🍕 Pizzaria Artesanal — Estudo de Caso 14

Sistema de pedidos de uma pizzaria artesanal, feito em **Kotlin** como desafio final da disciplina.

## Conceitos aplicados
- **POO:** classes `Pizza`, `Ingrediente` e `PedidoPizzaria`
- **Tipos:** `String`, `Double`, `Int`, `Boolean`
- **when:** define o preço base pelo tamanho (1 = R$ 35, 2 = R$ 50, 3 = R$ 65)
- **for:** soma os ingredientes extras
- **Null Safety:** `bordaRecheada` é `String?`; se nula, custo zero (`?.let` + `?:`)
- **if/else:** promoção de terça-feira (10% de desconto)

## Estrutura
```
src/
 ├─ Ingrediente.kt
 ├─ Pizza.kt
 ├─ PedidoPizzaria.kt
 └─ Main.kt
```

## Como executar
Abra a pasta no IntelliJ IDEA e execute a função `main` em `Main.kt`.

## Exemplo de cálculo (Pedido 1)
Base Grande 65,00 + extras 14,50 + borda 9,00 = 88,50 → desconto 10% (8,85) → **R$ 79,65**
