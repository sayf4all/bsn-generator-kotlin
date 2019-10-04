package nl.multicode.validate

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class BsnElfproefTest {

    lateinit var elfproef: BsnElfproef
    val invalidBsn = arrayOf("123456789", "123", "ABC123456", "!@#$%^&*()")

    @Before
    fun setup() {
        elfproef = BsnElfproef()
    }

    @Test
    fun isGeldigBSN_true() {
        assertTrue(elfproef.isGeldigBSN("593749388"))
    }

    @Test
    fun isGeldigBSN_false() {
        invalidBsn.forEach { badBsn ->
            assertFalse(elfproef.isGeldigBSN(badBsn))
        }
    }
}