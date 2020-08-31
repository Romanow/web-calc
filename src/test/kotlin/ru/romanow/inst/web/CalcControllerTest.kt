package ru.romanow.inst.web

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalcControllerTest {
    private val calc = CalcController()

    @Test
    fun plus() {
        assertEquals(4, calc.plus(2, 2))
    }

    @Test
    fun minus() {
        assertEquals(0, calc.minus(2, 2))
    }

    @Test
    fun multiply() {
        assertEquals(4, calc.multiply(2, 2))
    }

    @Test
    fun divide() {
        assertEquals(1, calc.divide(2, 2))
    }
}