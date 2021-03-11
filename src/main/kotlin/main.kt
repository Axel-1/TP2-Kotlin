import java.time.LocalDate
import java.time.LocalTime

fun main(args: Array<String>) {
    val inter1: Intervenant = IntervenantExterne("Nom", "Prénom", "zzzzzz", "aaaaaaa", "0123456789")
    val inter2: Intervenant = Intervenant("Nom", "Prénom")
    val inter3: Intervenant = IntervenantExterne("Nom", "Prénom", "zzzzzzz", "aaaaaaa", "0123456789")
    val dossier1: Dossier = Dossier("Patient1", "Patient1", LocalDate.parse("2000-01-01"))

    dossier1.ajoutePrestation("Presta1", LocalDate.parse("2021-01-01"), LocalTime.parse("20:01"), inter1)
    dossier1.ajoutePrestation("Presta2", LocalDate.parse("2021-01-01"), LocalTime.parse("20:01"), inter2)
    dossier1.ajoutePrestation("Presta3", LocalDate.parse("2021-01-01"), LocalTime.parse("20:01"), inter3)
}