fun main() {
    var myList = mutableListOf<String>()
    var reversedList = mutableListOf<String>()
    println("Enter a total value you want to add in list: ")
    var count = readLine()!!.toInt()
    for(i in 1..count){
        println("Enter a $i value")
        var input = readLine()!!.trim()
        myList += input
    }
    println("This is the normal string: " + myList)
    
    for(i in myList.size -1 downTo 0){
        reversedList += myList[i]
    }
    println("This is the reversed list: " + reversedList)
}