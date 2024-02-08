package com.example.evam3.service

class `CharactersService Test` {
    fun main() {
        testFunctionSuccess()
        testFunctionFailed()
    }
    fun validateVehicle(plate: String): Boolean {
        val regex = Regex("[A-Z]{3}\\d{4}")
        return regex.matches(plate)
    }

    fun testFunctionSuccess() {
        val plate = "ABC1234"
        val expectedValue = true

        val actualValue = validateVehicle(plate)

        if (actualValue == expectedValue)
            println("Success")
        else
            println("Failed")
    }

    fun testFunctionFailed() {
        val plate = "ABC01123" // Placa incorrecta
        val expectedValue = false

        val actualValue = validateVehicle(plate)

        if (actualValue == expectedValue)
            println("Success")
        else
            println("Failed")
    }
}