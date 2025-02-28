fun main(){
    var myList = mutableListOf<String>()
    var myMap = mutableMapOf<String,Int>()

    println("Write the total count of elements: ")
    var total = readLine()!!.toInt()

    for(i in 1..total){
        println("Enter $i element: ")
        var input = readLine()!!.trim()

        myList += input
 
        if(input in myMap ){
         myMap[input] = myMap[input]!!+1
        }else{
         myMap[input] = 1
        }
    }
    println("Words Frequencies:")
    for((input,count) in myMap){
        println("$input -> $count")
    }

}