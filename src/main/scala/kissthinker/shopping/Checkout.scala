package kissthinker.shopping

object Checkout {
  val costOf: ShoppingCart => BigDecimal =
    shoppingCart => shoppingCart.items.map(_.price).sum
}