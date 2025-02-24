fun main(){
    println("Enter a Number:")

    var num = readLine()!!.toInt()

    var fac = 1

    if(num >= 0) {
        for(i in 1..num){
            fac *= i
        }
        println("Factorial of $num is $fac")
    }else{
        println("Please enter a valid non-negative integer.")
    }
 
}
