fun main() {
    var number = 123456
    var count = 0

    while(number != 0){
        count++
        number /= 10
    }

    println("Numbers of digit: " + count);
}