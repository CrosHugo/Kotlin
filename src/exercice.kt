import java.util.*

val planetes = arrayOf("mercure", "Venus", "terre", "Mars","Jupiter", "saturne",
        "Uranus", "Neptune")

fun main() {
    println(planetes.first())
    println(planetes.last())
    println(planetes[0])
    println(planetes[7])

    val item = "terre"
    val index = planetes.indexOf(item)
    println(index)

    planetes[2] = "La Terre"
    println(planetes[2])

    println(planetes.filter { it.uppercase().startsWith('M') })
    for(planete in planetes)
        println(planete.lowercase().capitalize())
}
