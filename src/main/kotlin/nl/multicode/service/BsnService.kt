package nl.multicode.service

import nl.multicode.validate.Elfproef
import org.springframework.stereotype.Service
import java.util.concurrent.ThreadLocalRandom

@Service
class BsnService(private val elfproef: Elfproef) {
    private val MAX = 999999999
    private val MIN = 100000000

    fun isGeldigBSN(bsn: String): Boolean {
        return elfproef.isGeldigBSN(bsn)
    }

    fun getRandomBsn(): String {
        while (true) {
            val randomNumber = ThreadLocalRandom.current().nextInt(MIN, MAX).toLong()
            if (elfproef.isGeldigBSN(randomNumber.toString())) {
                return randomNumber.toString()
            }
        }
    }
}