fun main() {
    var my_List = mutableListOf<Int>()

    println("Enter total elements: ")
    var total = readLine()!!.toInt()

    for (i in 1..total) {
        println("Enter $i element in list: ")
        var input = readLine()!!.toInt()
        my_List += input
    }
    
    println("List: $my_List")

    var my_Set = mutableSetOf<Int>()

    for (element in my_List) {
        if (!my_Set.contains(element)) { 
            my_Set += element
        }
    }
    println("Set: $my_Set")
}
