package com.example.tokachev_practice


fun main() {
    
}

// Task 1
/*https://www.codewars.com/kata/5412509bd436bd33920011bc*/
private fun maskify(value: String): String {
    val result = value.toCharArray()
    for (i in 0..result.size - 5) {
        result[i] = '#'
    }
    return String(result)
}




