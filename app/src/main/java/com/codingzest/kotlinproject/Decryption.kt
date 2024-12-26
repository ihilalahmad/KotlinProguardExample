package com.codingzest.kotlinproject

class Decryption {

    fun decryptHmacKey(encryptedArray: List<String>): String {
        // Step 1: Extract and validate the original pieces using the marker
        val originalPieces = Array(3) { "" }
        for (piece in encryptedArray) {
            if (piece.startsWith("str_")) {
                val index = piece[4].digitToInt()
                val content = piece.substring(5)
                originalPieces[index] = content
            }
        }

        return originalPieces.joinToString("") { content ->
            val halfLength = (content.length + 1) / 2
            val reversedFirstHalf = content.substring(0, halfLength).reversed()
            val reversedSecondHalf = content.substring(halfLength).reversed()
            reversedSecondHalf + reversedFirstHalf
        }
    }

}