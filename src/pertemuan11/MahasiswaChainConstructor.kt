package pertemuan11

class MahasiswaChainConstructor {
    constructor () {
        println("Hi...")
    }

    constructor(str: String) {
        MahasiswaChainConstructor()
        println("Name of My program Is: $str")
    }

    constructor(str: String, numbr: Int) {
        MahasiswaChainConstructor("IZHX Eazy ERP")
        println("Name of My program Is: $str Last Updated $numbr")
    }

    constructor (a: String, b: Int, c: Int) {
        MahasiswaChainConstructor("Startup Here", 20)
        println("Hello There....")
    }
}