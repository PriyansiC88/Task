fun main() {
    var my_list = mutableListOf<Int>()

    print("Enter the total count of elements: ")
    var count = readLine()!!.toInt()

    for(i in  1..count){
        print("Enter a $i element: ")
        var num = readLine()!!.toInt()
        my_list += num
    }   

    println("List :"+ my_list)

    var max = my_list.maxOrNull()

    println("The largest number form the list is: "+ max)


}