package nl.multicode.rest

import nl.multicode.service.BsnService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/bsn")
class BsnController(private val bsnService: BsnService) {

    @GetMapping("/validate/{bsnnummer}")
    fun validate(@PathVariable bsnnummer: String): Boolean {
        return bsnService.isGeldigBSN(bsnnummer)
    }

	@GetMapping("/generate")
    fun validate(): String {
        return bsnService.getRandomBsn()
    }
}
