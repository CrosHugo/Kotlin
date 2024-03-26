class voiture{
    var marque: String = ""
    var modele: String = ""
    var vitesse: Int = 0
}
fun main(){
    val v1 = voiture()
    v1.marque = "Peugeot"
    v1.modele = "308"
    v1.vitesse = 60

    val v2 = voiture()
    v2.marque = "Volvo"
    v2.modele = "V50"
    v2.vitesse = 40

    println(v1.marque)
    println(v1.modele)
    println(v1.vitesse)
    println(v2.marque)
    println(v2.modele)
    println(v2.vitesse)
}