fun main() {
    println("Enter a number count: ")
    var count = readLine()!!.toInt()
    var my_list = mutableListOf<Int>()
    for(i in 1..count){
      println("Enter a $i  values:")
      var input = readLine()!!.toInt()
      my_list += input  
    }
    println(my_list)
    var oddCount = 0
    var evenCount = 0
    for(i in my_list){
        if(i%2==0){
            evenCount++
        }else{
            oddCount++
        }
    }
    println("even number count is: " + evenCount)
    println("odd number count is: " + oddCount)
}