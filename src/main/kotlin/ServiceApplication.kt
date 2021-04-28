package com.factory14

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(ServiceApplication::class.java, *args)
}