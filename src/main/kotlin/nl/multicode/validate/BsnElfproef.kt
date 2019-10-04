package nl.multicode.validate

import org.springframework.stereotype.Component

@Component
class BsnElfproef : Elfproef {
    private val BSN_ONDNR_MULTIPLIERS = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, -1)
    private val regex = """^[0-9]{9}$""".toRegex()

    override fun isGeldigBSN(bsn: String): Boolean {
        if (regex.containsMatchIn(bsn)) {
            var bsnDigits = bsn.toCharArray()
                    .map(Character::getNumericValue)
                    .toIntArray()
            return isElfProef(bsnDigits, BSN_ONDNR_MULTIPLIERS)
        }
        return false
    }
}