package one.digitalinnovation.collections

fun main (){
    val joao = Employee( "João",  1500.0,"CLT")
    val maria = Employee( "Maria",   5000.0,"PJ")
    val jose = Employee( "José",  1200.0,"CLT")

    val functionaries1= setOf(joao,maria)
    val functionaries2= setOf(jose)


    val resultUnion = functionaries1.union(functionaries2)
    resultUnion.forEach{ println(it)}

    println("--------------------------------")
    val functionaries3 = setOf(joao,maria,jose)
    val resultsub = functionaries3.subtract(functionaries2)
    resultsub.forEach{println(it)}
}

