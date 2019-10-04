package nl.multicode.validate

interface Elfproef {

    fun isGeldigBSN(bsn: String): Boolean

    fun isElfProef(digits: IntArray, multipliers: IntArray): Boolean {
        val uitkomst: Long = 0
        var sum: Long = 0
        for (i in multipliers.indices) {
            sum += digits[i] * multipliers[i]
        }
        return sum % 11 == uitkomst
    }
}
