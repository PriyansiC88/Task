fun main(){
    println("Enter a letter: ")
    var input = readLine()?.lowercase()?.firstOrNull()

    if(input != null && input in 'a'..'z'){
        if(input in listOf('a','e','i','o','u')){
            println("$input is a vowel.")
        }else{
            println("$input is a consonant.")
        }
    }else{
        println("Invalid input! Plese enter a alphabet.")
    }


}