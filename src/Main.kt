import pertemuan11.*
import pertemuan12.*

fun main() {
    println("Pertemuan 3")
    // Encapsulation
    println("\nEncapsulation")
    val mhs1 = Mahasiswa()
    mhs1.setName("Lia")
    println("Hi,,, ${mhs1.getName()}")
    println("You are pretty, i like you")

    //Single Constructor
    println("\nSingle Constructor")
    val singlConstruct = MahasiswaSingleConstructor()
    println("Hi, Nice to meet you ${singlConstruct.name}")
    println("You look pretty, i like you")

    // Constructor with Parameter
    println("\nConstructor with Parameter")
    val mhsWithParam = MahasiswaParamsConstructor("Hendra")
    println("Hi my name is ${mhsWithParam.name}")
    println("Nice to meet you")

    // Multiple Constructor
    println("\nMultiple Constructor")
    val mhsMtpConstruct1 = MahasiswaMultipleConstructor()
    val mhsMtpConstruct2 = MahasiswaMultipleConstructor("Hendra")

    println("Hi, my name is ${mhsMtpConstruct1.name}")
    println("and my name is ${mhsMtpConstruct2.name}")
    println("Nice to meet you")

    // Private Constructor
    println("\nPrivate Constructor")
    MahasiswaPrivateConstructor.currentCount = 200
    MahasiswaPrivateConstructor.incrementCount()
    println("New Count from this Counter is ${MahasiswaPrivateConstructor.currentCount}")

    // Chain Constructor
    println("\nChain Constructor")
    MahasiswaChainConstructor("Start Chain ", 6, 7)

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

    // Pertemuan 12
    // Method Without param
    println("\nMethod Without param")
    val methodWithoutParam = MahasiswaMethodWithoutParam()
    methodWithoutParam.hello()

    // Method With Param
    println("\nMethod With Param")
    val methodWithParam = MahasiswaMethodWithParam()
    methodWithParam.hello("Lia")

    // Static Method
    println("\nStatic Method")
    MahasiswaStaticMethod.show()

    // Setter Only Method
    println("\nSetter Only Method")
    val setterOnlyMethod = MahasiswaSetterMethod()
    setterOnlyMethod.name = "Clarisha"

    // Getter Only Method
    println("\nGetter Only Method")
    val getterOnlyMethod = MahasiswaGetterMethod()
    println("Hi... My name is ${getterOnlyMethod.name}")
    println("Nice to Meet You")

    // Getter With Setter Method
    println("\nGetter With Setter Method")
    val getterWithSetterMethod = MahasiswaGetterSetterMethod()
    getterWithSetterMethod.name = "Clarisha"
    println("My name is ${getterWithSetterMethod.name}")
    println("Nice to Meet You")

    // Static Property
    println("\nStatic Property")
    MahasiswaStaticProperty.name = "Via Lestari"
    println("Name 1: ${MahasiswaStaticProperty.name}")
    MahasiswaStaticProperty.name = "Clarisha"
    println("Name 2: ${MahasiswaStaticProperty.name}")

}