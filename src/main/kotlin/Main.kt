fun main() {
    print(solution("*..*", "*.*"))
}

fun solution(comb1: String, comb2: String): Int {
    val minComb1 = comb1.indexOf('*')
    val maxComb1 = comb1.lastIndexOf('*')
    val minComb2 = comb2.indexOf('*')
    val maxComb2 = comb2.lastIndexOf('*')

    val minIndex = minOf(minComb1, minComb2)
    val maxIndex = maxOf(maxComb1, maxComb2)

    var purseLength = maxIndex - minIndex + 1

    for (i in minIndex..maxIndex) {
        if (comb1.getOrNull(i) != '*' || comb2.getOrNull(i - minIndex) != '*') {
            purseLength++
        }
    }

    return purseLength
}
