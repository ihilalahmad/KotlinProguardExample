package com.codingzest.kotlinproject

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val decryption = Decryption()

        val encryptedArray = listOf(
            "8kpa",
            "HMBN",
            "WShR",
            "str_1_ot_dn",
            "str_0etnorf",
            "str_2dnekcab",
            "bHlD",
            "W2vD"
        )
        try {
            val decryptedKey = decryption.decryptHmacKey(encryptedArray)
            println("Decrypted Key: $decryptedKey") // Expected Output: frontend_to_backend
        } catch (e: Exception) {
            println("Error: ${e.message}")
        }
    }
}

