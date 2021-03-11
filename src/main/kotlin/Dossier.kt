import java.time.LocalDate
import java.time.LocalTime

class Dossier(
    private val nomPatient: String,
    private val prenomPatient: String,
    private val dateNaissPatient: LocalDate,
) {
    private var mesPrestation: ArrayList<Prestation> = ArrayList()
    fun ajoutePrestation(unLibelle: String, uneDate: LocalDate, uneHeure: LocalTime, unIntervenant: Intervenant) {
        this.mesPrestation.add(Prestation(unLibelle, uneDate, uneHeure, unIntervenant))
    }

    fun getNbPrestationsExternes(): Int {
        var prestaCounter: Int = 0
        for (item: Prestation in this.mesPrestation) {
            if (item.getL_Intervenant().javaClass == IntervenantExterne::class.java) {
                prestaCounter++
            }
        }
        return prestaCounter
    }

    fun getNbPrestations(): Int {
        return this.mesPrestation.count()
    }

    fun getNbJoursSoins(): Int {
        return 0
    }

    fun getPrestation(i: Int): Prestation {
        return this.mesPrestation[i]
    }
}