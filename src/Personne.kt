class Personne{
    var nom = ""
    var taille = 0.0
    var poids = 0.0
    var imc = poids / (taille * taille)
}
fun main(){
    val p1 = Personne()
    val p2 = Personne()
    p1.nom = "Billy"
    p1.taille = 2.05
    p1.poids = 100.0
    p1.imc = p1.poids / (p1.taille * p1.taille)

    p2.nom = "Jessica"
    p2.taille = 2.5
    p2.poids = 180.0
    p2.imc = p2.poids / (p2.taille * p2.taille)

    println(p1.nom)
    println(p1.taille)
    println(p1.poids)
    println(p1.imc)

    println(p2.nom)
    println(p2.taille)
    println(p2.poids)
    println(p2.imc)

}