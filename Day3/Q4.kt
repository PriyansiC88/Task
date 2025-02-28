fun main(){
    var myList = mutableListOf<Int>()

    println("Enter total elements: ")
    var count = readLine()!!.toInt()

    for(i in 1..count){
        println("Enter $i element in list: ")
        var input = readLine()!!.toInt()

        myList += input
    }
    println(myList)

    val max = myList.maxOrNull()?: "List is empty"
    val min = myList.minOrNull()?: "List is empty"

    println("min number is: " + min)
    println("max number is: " + max)
}