fun main() {
    var studentGrade = mapOf("jay" to 95 , "riya" to 85 , "jiya" to 72 , "shivam" to 63 , "kriya" to 79)
    
    println("Students scoring above 75: ")
    for((name,grade) in studentGrade){
        if(grade > 75){
            println("$name: $grade")
        }
    }
}