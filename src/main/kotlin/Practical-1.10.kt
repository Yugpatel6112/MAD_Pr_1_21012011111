class Student(var name:String): Person("Yug") {
    var Erno: String = "21012011111"
    constructor(name: String, Erno: String) : this(name) {
        var ERNO = Erno
    }

    init {
        println("My name is $name")
        println("My Enrollment number is $Erno")
    }

    override fun toString(): String {
        return super.toString()
    }

}
open class Person (firstname:String)
{
    var Phoneno=9192935252
    var Address="surat"
}
    fun main(){
        val s=Student("Yug")
        println(s.name)
        println(s.Erno)
        val p=Person("Yug")
        println(p.Phoneno)
        println(p.Address)
    }

