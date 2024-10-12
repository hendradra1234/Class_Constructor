package pertemuan11

class MahasiswaPrivateConstructor (someNumber: Int) {
    init {
        println("Old Count: $someNumber")
    }

    companion object {
        var currentCount = 0
        fun incrementCount() = ++currentCount
    }
}