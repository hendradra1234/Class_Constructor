package pertemuan12

fun methodWithoutParam () {
    // Method Without param
    println("\nMethod Without param")
    val mhs = MahasiswaMethodWithoutParam()
    mhs.hello()
}

fun methodWithParam () {
    // Method With Param
    println("\nMethod With Param")
    val mhs = MahasiswaMethodWithParam()
    mhs.hello("Lia")
}

fun staticMethod () {
    // Static Method
    println("\nStatic Method")
    MahasiswaStaticMethod.show()
}

fun setterOnlyMethod () {
    // Setter Only Method
    println("\nSetter Only Method")
    val mhs = MahasiswaSetterMethod()
    mhs.name = "Clarisha"
}

fun getterOnlyMethod () {
    // Getter Only Method
    println("\nGetter Only Method")
    val mhs = MahasiswaGetterMethod()
    println("Hi... My name is ${mhs.name}")
    println("Nice to Meet You")
}

fun methodWithSetterAndGetter () {
    // Getter With Setter Method
    println("\nGetter With Setter Method")
    val mhs = MahasiswaGetterSetterMethod()
    mhs.name = "Clarisha"
    println("My name is ${mhs.name}")
    println("Nice to Meet You")
}

fun staticProperty () {
    // Static Property
    println("\nStatic Property")
    MahasiswaStaticProperty.name = "Via Lestari"
    println("Name 1: ${MahasiswaStaticProperty.name}")
    MahasiswaStaticProperty.name = "Clarisha"
    println("Name 2: ${MahasiswaStaticProperty.name}")
}