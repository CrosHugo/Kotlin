fun main() {
    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add( (1..100).random())
    }
    println(entiers)
    println("la somme des elelements de cette liste d'entiers est ${entiers.sum()}" )
    println("le plus petit nombre de cette liste est ${entiers.min()}")
    println("le plus grand nombre de cette liste est ${entiers.max()}")

    val entiersPairs = mutableListOf<Int>()
    val entiersImpairs = mutableListOf<Int>()

    for(nombre in entiers){
        if(nombre % 2 == 0){
            entiersPairs.add(nombre)
        }else{
            entiersImpairs.add(nombre)
        }
    }
    println("liste des nombres pairs ${entiersPairs}")
    println("liste des nombres impairs ${entiersImpairs}")
}