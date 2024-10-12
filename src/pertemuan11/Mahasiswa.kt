package pertemuan11
// Encapsulation
class Mahasiswa {
    private var name = String()
    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String = name
}