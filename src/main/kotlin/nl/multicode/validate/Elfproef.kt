package nl.multicode.validate

import org.springframework.stereotype.Component

@Component
class Elfproef {

    private val BSN_ONDNR_MULTIPLIERS = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, -1)
    private val regex = """^[0-9]{9}$""".toRegex()

    fun isGeldigBSN(bsn: String): Boolean {
        if (regex.containsMatchIn(bsn)) {
            var bsnDigits = bsn.toCharArray()
                    .map(Character::getNumericValue)
                    .toIntArray()
            return isElfProef(bsnDigits, BSN_ONDNR_MULTIPLIERS)
        }
        return false
    }

    private fun isElfProef(digits: IntArray, multipliers: IntArray): Boolean {
        val uitkomst: Long = 0
        var sum: Long = 0
        for (i in multipliers.indices) {
            sum += digits[i] * multipliers[i]
        }
        return sum % 11 == uitkomst
    }
}
