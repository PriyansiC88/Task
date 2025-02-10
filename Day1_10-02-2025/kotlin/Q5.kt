fun main() {
    var fac = 1
    var a = 6
    var i =  a

    while(i>0){
        fac *= i
        i--
    }
    println("Factorial of " + a + " is " + fac)
}