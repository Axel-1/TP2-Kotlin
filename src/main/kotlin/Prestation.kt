import java.time.LocalDate
import java.time.LocalTime

class Prestation(
    private val libelle: String,
    private val dateSoin: LocalDate,
    private val heureSoin: LocalTime,
    private val l_Intervenant: Intervenant
) {
    init {
        this.l_Intervenant.ajoutePrestation(this)
    }

    fun compareTo(unePrestation: Prestation): Int {
        when {
            this.dateSoin.isEqual(unePrestation.getDateSoin()) -> return 0
            this.dateSoin.isAfter(unePrestation.getDateSoin()) -> return 1
        }
        return -1
    }

    fun getDateSoin(): LocalDate {
        return this.dateSoin
    }

    fun getHeureSoin(): LocalTime {
        return this.heureSoin
    }

    fun getL_Intervenant(): Intervenant {
        return this.l_Intervenant
    }

    fun getLibelle(): String {
        return this.libelle
    }
}