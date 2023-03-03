fun main() {
    val ukuran = 17
    for (i in 0 until ukuran) {
        for (j in 0 until ukuran) {
            if (i == j || i + j == ukuran - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
