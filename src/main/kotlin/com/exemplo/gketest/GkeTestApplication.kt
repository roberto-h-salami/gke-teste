package com.exemplo.gketest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GkeTestApplication

fun main(args: Array<String>) {
    runApplication<GkeTestApplication>(*args)
}

@RestController
class TestController {

    @GetMapping("/teste")
    fun teste(): String {
        return "Teste GKE Roberto"
    }
}
