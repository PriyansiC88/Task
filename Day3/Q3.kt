fun main() {
    var my_list = listOf<Int>()
    var my_set = mutableSetOf<Int>()

    println("Enetr a value count you want to enter: ")
    var count = readLine()!!.toInt()

    for(i in 1..count){
        println("Enter a $i value: ")
        var input = readLine()!!.toInt()
        my_list += input
    }
    println(my_list)
    my_set.addAll(my_list)
    println(my_set)
}