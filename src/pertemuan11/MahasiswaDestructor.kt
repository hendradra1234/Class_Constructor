package pertemuan11

class MahasiswaDestructor {
    var jumlah: Int? = null

    init {
        println("Constructor is Running")
    }

    protected fun finalize() {
        this.jumlah = 0
        println("Finalize Gabage Collector is Running")
        println("Jumlah mahasiswa adalah: $jumlah")
    }
}