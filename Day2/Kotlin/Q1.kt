fun main(){
    println("Enter First Number: ")
    var num1 = readLine()!!.toInt()

    println("Enter Second Number: ")
    var num2 = readLine()!!.toInt()

    var sum = (num1..num2).sum()

    println("Sum of $num1 and $num2 is $sum")  
}