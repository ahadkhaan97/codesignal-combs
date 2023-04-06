fun main() {
    print(solution("*..*", "*.*"))
}

fun solution(comb1: String, comb2: String): Int {
    return minOf(findPurseLength(comb1, comb2), findPurseLength(comb2, comb1))
}

fun findPurseLength(comb1: String, comb2: String): Int {
    for (i in comb1.indices) {
        if (comb1[i] == '.') {
            for (j in comb2.indices) {
                if (comb2[j] == '*' && comb1[i+j] == '*') {
                    break
                }
                if (j == comb2.length - 1 || i+j == comb1.length-1) {
                    return maxOf(comb1.length, i + comb2.length)
                }
            }
        }
    }
    return comb1.length + comb2.length
}

