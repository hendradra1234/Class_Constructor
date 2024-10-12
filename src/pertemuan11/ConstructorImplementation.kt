package pertemuan11

fun encapsulation () {
    // Encapsulation
    println("\nEncapsulation")
    val mhs1 = Mahasiswa()
    mhs1.setName("Lia")
    println("Hi,,, ${mhs1.getName()}")
    println("You are pretty, i like you")
}

fun singleConstructor () {
    //Single Constructor
    println("\nSingle Constructor")
    val singlConstruct = MahasiswaSingleConstructor()
    println("Hi, Nice to meet you ${singlConstruct.name}")
    println("You look pretty, i like you")
}

fun constructorWithParams () {
    // Constructor with Parameter
    println("\nConstructor with Parameter")
    val mhsWithParam = MahasiswaParamsConstructor("Hendra")
    println("Hi my name is ${mhsWithParam.name}")
    println("Nice to meet you")
}

fun multipleConstructors() {
    // Multiple Constructor
    println("\nMultiple Constructor")
    val mhsMtpConstruct1 = MahasiswaMultipleConstructor()
    val mhsMtpConstruct2 = MahasiswaMultipleConstructor("Hendra")

    println("Hi, my name is ${mhsMtpConstruct1.name}")
    println("and my name is ${mhsMtpConstruct2.name}")
    println("Nice to meet you")
}

fun privateConstructor () {
    // Private Constructor
    println("\nPrivate Constructor")
    MahasiswaPrivateConstructor.currentCount = 200
    MahasiswaPrivateConstructor.incrementCount()
    println("New Count from this Counter is ${MahasiswaPrivateConstructor.currentCount}")
}

fun chainConsructor () {
    // Chain Constructor
    println("\nChain Constructor")
    MahasiswaChainConstructor("Start Chain ", 6, 7)
}

fun destructorAndGabageCollector () {
    // Destructor and Garbage Collector
    println("\nDestructor and Garbage Collector")
    var amount1: MahasiswaDestructor? = MahasiswaDestructor()
    var amount2 = MahasiswaDestructor()

    amount1!!.jumlah = 20
    amount2.jumlah = 30

    println("Ammont of Student in Class 1: ${amount1.jumlah}")
    println("Ammont of Student in Class 2: ${amount2.jumlah}")

    amount1 = null
    System.gc()
    println("Amount After Gabage Collector: ${amount2.jumlah}")
}