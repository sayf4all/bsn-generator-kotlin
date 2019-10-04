package nl.multicode.service

import nl.multicode.validate.BsnElfproef
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class BsnServiceTest {

    lateinit var elfproef: BsnElfproef
    lateinit var bsnService: BsnService

    @Before
    fun setup() {
        elfproef = Mockito.mock(BsnElfproef::class.java)
        bsnService = BsnService(elfproef)
    }

    @Test
    fun isGeldigBSN() {
        Mockito.`when`(elfproef.isGeldigBSN("valid bsn")).thenReturn(true)
        assertTrue(bsnService.isGeldigBSN("valid bsn"))
        assertFalse(bsnService.isGeldigBSN("invalid bsn"))
    }

    @Test
    fun getRandomBsn() {
        Mockito.`when`(elfproef.isGeldigBSN(any())).thenReturn(true)
        assertEquals(9, bsnService.getRandomBsn().length)
    }

    fun <T> any(): T = Mockito.any<T>()
}