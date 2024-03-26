import java.time.LocalDate

class employe{
    var Matricule = 0
    var Nom = ""
    var Prénom = ""
    var AnneeEmbauche = 0
    var Salaire = 0.0

    constructor(){
    }

    constructor(Matricule:Int ,Nom:String ,Prénom:String ,AnneeEmbauche:Int ,Salaire:Double){
        this.Matricule = Matricule
        this.Nom = Nom
        this.Prénom =Prénom
        this.AnneeEmbauche = AnneeEmbauche
        this.Salaire = Salaire
    }
    fun anciennete():Int{
        val anneeEnCours = LocalDate.now().year
        return anneeEnCours - this.AnneeEmbauche
    }
    fun AugmentationDeSalaire():Double{
        var Augmentation = 0.0
        if (this.anciennete() < 10){
            Augmentation = this.Salaire+(this.Salaire*0.05)
        }
        else if(this.anciennete()<5){
            Augmentation = this.Salaire+(this.Salaire*0.02)
        }
        else{
            Augmentation = this.Salaire+(this.Salaire*0.10)
        }
        return Augmentation

    }
}


fun main(){
    var emp1=employe(879456, "Marcel","Billy",2000,2000.50)
    println(emp1.Matricule)
    println(emp1.Nom)
    println(emp1.Prénom)
    println(emp1.AnneeEmbauche)
    println(emp1.Salaire)
    println(emp1.anciennete())
    println(emp1.AugmentationDeSalaire())
}
