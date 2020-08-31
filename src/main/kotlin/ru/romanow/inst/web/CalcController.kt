package ru.romanow.inst.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calc")
class CalcController {

    @GetMapping("/plus")
    fun plus(a: Int, b: Int): Int = a + b

    @GetMapping("/minus")
    fun minus(a: Int, b: Int): Int = a - b

    @GetMapping("/multiply")
    fun multiply(a: Int, b: Int): Int = a * b

    @GetMapping("/divide")
    fun divide(a: Int, b: Int): Int = a / b
}