class Location{
    var nom = ""
    var categorie = ""
    var nbKm = 0.0
    var nbJour = 0
constructor(){
}
constructor(nom: String, categorie:String, nbKm : Int, nbJour: Int){
    this.nom = nom
    this.categorie = categorie
    this.nbKm = nbKm.toDouble()
    this.nbJour = nbJour
}
 
}