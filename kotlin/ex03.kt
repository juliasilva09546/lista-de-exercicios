fun main() {
  print("Produto: ")
  val produto - readln()
  print("Preço unitário (ex.: 12.50): ")
  val preço  redln().toDouble()
  pritnt("Quantidade: ")
  val quantidade - readln().toInt()

  if (preço < 0 || quantidade <-0) {
    println("Preço ou quantidade inválidos")
    return
  }

  val total = preço * quantidade
  println("Produto: $produto")
  println("Quantidade: $quantidade")
  println("Tottl: R$%.2f". Format(total))
}

  
