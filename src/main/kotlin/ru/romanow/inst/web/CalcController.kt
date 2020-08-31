package ru.romanow.inst.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calc")
class CalcController {

    @GetMapping("/plus")
    fun plus(@RequestParam a: Int, @RequestParam b: Int): Int = a + b

    @GetMapping("/minus")
    fun minus(@RequestParam a: Int, @RequestParam b: Int): Int = a - b

    @GetMapping("/multiply")
    fun multiply(@RequestParam a: Int, @RequestParam b: Int): Int = a * b

    @GetMapping("/divide")
    fun divide(@RequestParam a: Int, @RequestParam b: Int): Int = a / b
}