fun main(args: Array<String>) {

    print("Entre un nombre:")
    val ask = readLine()!!
    val nbrplayer = ask.toInt();                            // Entrer le nombre à trouver
    var line : String
    fun sum(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    val sum1 = sum(nbrplayer,10)                        // fait une différence de 10 max
    val sub1 = sub(nbrplayer,10)                        // fait une différence de 10 max

    println("Tape '-666' pour quitter !")
    print("Première tentative :")
    var var1 = 1
    do {
        line = readLine()!!
        var lineOk = line.toInt()

        if (lineOk == -666) {                               // Pour quitter le programme
            println("Programmé arrêté")
            break
        }
        if (lineOk > nbrplayer) {                           // si le nombre entré par le joueur > nombre entré intialement
            print("Ton nombre est trop grand")              // Afficher ça
            if (lineOk < sum1) {                            // si le nombre à une différence inférieur à 10
                println(",mais t'es pas très loin :D ")     // alors afficher ça
            }
            else {
                println(", beaucoup trop grand ;) ")        // sinon afficher ça
            }
        }
        if (lineOk < nbrplayer) {                           // si le nombre entré par le joueur < nombre entré intialement
            print("Ton nombre est trop petit")              // Afficher ça
            if  (lineOk > sub1) {                           // si le nombre à une différence inférieur à 10
                println(", mais t'es pas très loin :D ")    // alors afficher ça
            }
            else {
                println(", beaucoup trop petit ;) ")        // sinon afficher ça
            }
        }
        if (lineOk == nbrplayer) {                          // si le nombre du joueur = nombre entré initialement
            println(" Nombre trouvé ! :) ")                 // Afficher ça
            break
        }
        var1 ++
        print("Tentative n°" +var1+ " :")                   // Ajouter +1 a 'var1' pour marquer le nombres de tentative faites.


    } while (true)

}
