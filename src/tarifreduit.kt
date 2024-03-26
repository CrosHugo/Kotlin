fun main(){
    println("entrez votre âge")
    val age = readln().toInt()
    if (age<26){
        println("tarif reduit")
    }else{
        println("tarif normal")
    }
}