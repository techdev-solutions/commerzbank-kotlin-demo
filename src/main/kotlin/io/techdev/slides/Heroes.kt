@file:JvmName("Heroes")
package io.techdev.slides

data class Item(val name: String)

data class Superhero(val name: String, var strength: Int = 100, val item: Item? = null)

fun main(args: Array<String>) {
    val hammer = Item("Hammer")
    val thor = Superhero("Thor", item = hammer)

    println("${thor.name} has a ${hammer.name}")
}
