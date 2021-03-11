open class Intervenant(
    private val nom: String,
    private val prenom: String
) {
    private var lesPrestation: ArrayList<Prestation> = ArrayList()

    fun getNom(): String {
        return this.nom
    }

    fun getPrenom(): String {
        return this.prenom
    }

    fun ajoutePrestation(unePrestation: Prestation) {
        this.lesPrestation.add(unePrestation)
    }
}