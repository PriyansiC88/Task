fun main() {
    var my_list = listOf("Apple","Banana","Cherry","Mango")
    for(i in my_list.size - 1 downTo 0 ){
        println(my_list[i])
    }
}