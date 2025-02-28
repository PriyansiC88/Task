fun main() {
    var my_list = mutableListOf<Int>()
    var filterList = mutableListOf<Int>()
    println("Enter a total value you want to add in list: ")
    var count = readLine()!!.toInt()
    for(i in 1..count){
        println("Enter value for $i: ")
        var input = readLine()!!.toInt()
        my_list += input
    }
    println("Normal list: " + my_list)
    
    for(i in my_list ){
        if(i > 10){
           filterList += i
        }
    }
    println("numbers greater than 10 : " + filterList)
}