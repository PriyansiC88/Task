fun main(){
    println("Enter a Number: ")

    var num = readLine()!!.toInt()

    var sum = 0

    if(num > 0){
        for(i in 1..num){
            sum += i
        }
        println("Sum of natural numbers from 1 to $num is $sum")
    }else{
        println("Please enter a valid positive integer.")
    }
}