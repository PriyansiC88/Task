fun main() {
    var myMap = mutableMapOf<String,String>()
    println("How many key and value you want to add? ")
    var count =  readLine()!!.toInt()

    for(i in 1..count){
        println("Enter a key for $i: ")
        var key = readLine().toString()
        println("Enter a value for $key: ")
        var value = readLine().toString()
        myMap[key] = value
    }
    for((key,value) in myMap){
        println("$key -> $value")
    }
}