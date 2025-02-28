fun main(){
    println("Enter how many elements you want: ")
    var count = readLine()!!.toInt()

    var myList = mutableListOf<Int>()

    for(i in 1..count){
        println("Enter $i number element: ")
        var input = readLine()!!.toInt()
        
        myList += input
    }
    println(myList)

    var sum = 0

    for(i in myList){
        sum +=i
    }

    println("sum of all elements in a list is: "+ sum)
}