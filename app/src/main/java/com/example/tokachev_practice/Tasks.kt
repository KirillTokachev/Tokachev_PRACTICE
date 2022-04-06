package com.example.tokachev_practice

import java.util.regex.Pattern


fun main() {
    print(duplicateCount("aabBcde"))
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

//Task 2
/*https://www.codewars.com/kata/5679aa472b8f57fb8c000047*/
private fun findEvenIndex(arr: IntArray): Int {
    val list = arr.toList()
    for (index in arr.indices) {
        val leftSum = list.subList(0, index + 1).sum()
        val rightSum = list.subList(index, arr.size).sum()
        if (leftSum == rightSum) {
            return index
        }
    }
    return -1
}

//Task 4
/*https://www.codewars.com/kata/525f50e3b73515a6db000b83/solutions/java*/
private fun createPhoneNumber(numbers: IntArray): String {
    return String.format(
        "(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
        numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]
    )
}

//Task 5
/*https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023*/
private fun validateUsr(str: String): Boolean {
    return Pattern.compile(
        "^(?=.{4,16}\$)(?:[a-zA-Z\\d]+(?:(?:\\.|-|_)[a-zA-Z\\d])*)+\$"
    ).matcher(str).matches()
}

// 8 kyu

/*https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/kotlin*/
private fun getAge(yearsOld: String): Int {
    return Character.getNumericValue(yearsOld[0])
}

/*https://www.codewars.com/kata/55a70521798b14d4750000a4*/
private fun greet(name: String): String = "Hello, $name how are you doing today?"

// 7 kyu

/*https://www.codewars.com/kata/54ff3102c1bad923760001f3/solutions/kotlin*/
private fun getCount(str: String): Int = str.count { it in "aeiou" }

/*https://www.codewars.com/kata/554e4a2f232cdd87d9000038/kotlin*/
private fun makeComplement(dna: String): String = dna.replace(Regex("[ATCG]")) {
    when (it.value) {
        "A" -> "T"
        "T" -> "A"
        "C" -> "G"
        "G" -> "C"
        else -> it.value
    }
}

// 6 kyu

/*https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/kotlin*/
private fun duplicateCount(text: String): Int =
    text.toLowerCase()
        .groupingBy { it }.eachCount()
        .count { it.value > 1 }






