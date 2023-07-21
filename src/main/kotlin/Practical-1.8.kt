import java.util.*
fun main()
{
    println("Create Array-1 by using arrayOf() method:")
    var a1= arrayOf<Int>(7,10,18,33,45)
    println(Arrays.deepToString(a1))
    println("Create Array-2 by using array<> method:")
    var a2=Array<Int>(5){7}
    println(Arrays.deepToString(a2))
    println("Create Array-3 by using array<> and lambda function:")
    var a3=Array<Int>(7){i:Int->i}
    println(Arrays.deepToString(a3))
    println("Create Array-4 by using IntArray():")
    var a4=IntArray(7)
    a4[0]=5
    a4[1]=6
    a4[2]=9
    a4[3]=11
    a4[4]=10
    for(i in 0..4)
    {
        print("${a4[i]}")
    }
    println()
    println("Create Array-5 by using IntArrayOf():")
    var a5= IntArray(5)
    for(i in 0..a5.size-1) {
        print("${a5[i]}")
    }
    println()
    var a6=arrayOf(arrayOf(10,11,12,13,14), arrayOf(7,10,18,33,45))
    println("Create 2D Array-6 by using arrayOf() and intArrayOf()")
    println(Arrays.deepToString(a6))
    println("Please enter Array value:")
    var a7= IntArray(5)
    for(i in 0..a7.size-1)
    {

        println("a[$i]:${a7[i]}")
    }


}