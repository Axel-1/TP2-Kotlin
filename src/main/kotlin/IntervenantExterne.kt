class IntervenantExterne(
    private val unNom: String,
    private val unPrenom: String,
    private val uneSpecialite: String,
    private val uneAdresse: String,
    private val unTel: String
) : Intervenant(unNom, unPrenom) {
    fun getSpecialite(): String {
        return this.uneSpecialite
    }

    fun getAdresse(): String {
        return this.uneAdresse
    }

    fun getTel(): String {
        return this.unTel
    }
}