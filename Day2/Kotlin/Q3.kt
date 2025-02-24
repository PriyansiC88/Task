fun main() {

    print("Enter a Character: ")
    var input = readLine()?.firstOrNull()

    if(input != null){
        if((input in 'a'..'z') || (input in 'A'..'Z')){
            println("$input is an alphabet")
        }else{
            println("$input is not an alphabet")
        }
    }else{
        println("Enter a Valid Input.")
    }
}
