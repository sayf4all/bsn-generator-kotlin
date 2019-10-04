package nl.multicode.rest

import junit.framework.Assert.*
import nl.multicode.service.BsnService
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock

internal class BsnControllerTest {

    lateinit var bsnService: BsnService
    lateinit var bsnController: BsnController

    @Before
    fun setup() {
        bsnService = mock(BsnService::class.java)
        bsnController = BsnController(bsnService)
    }

    @Test
    fun validate() {
        Mockito.`when`(bsnService.isGeldigBSN("valid bsn")).thenReturn(true)
        assertTrue(bsnController.validate("valid bsn"));
        Mockito.`when`(bsnService.isGeldigBSN("invalid bsn")).thenReturn(false)
        assertFalse(bsnController.validate("invalid bsn"));
    }

    @Test
    fun generate() {
        Mockito.`when`(bsnService.getRandomBsn()).thenReturn("valid bsn")
        assertEquals("valid bsn", bsnController.generate());
    }
}