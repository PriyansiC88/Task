fun main(){
    var firstSet = mutableSetOf<String>()
    var secondSet = mutableSetOf<String>()
  
    println("Enter the total elements for your Firstset: ")
  
    var total1 = readLine()!!.toInt()
  
    for(i in 1..total1){
      println("Enter elements for $i: ")
  
      var elemenets = readLine()!!.toString()
  
      firstSet += elemenets
  
    }
  
    println("Enter the total elements for your Secondset: ")
  
    var total2 = readLine()!!.toInt()
  
    for(i in 1..total2){
      println("Enter elements for $i: ")
  
      var input = readLine()!!.toString()
  
      secondSet += input
  
    }
  
    var intersection = firstSet.intersect(secondSet)
  
    println(firstSet)
    println(secondSet)
    println(intersection)
  
  
  }