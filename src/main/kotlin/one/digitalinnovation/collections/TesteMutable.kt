package one.digitalinnovation.collections

fun main () {
    val joao = Employee("João", 1500.0, "CLT")
    val maria = Employee("Maria", 5000.0, "PJ")
    val jose = Employee("José", 1200.0, "CLT")

    val functionaries = mutableListOf(joao, maria)
    functionaries.forEach { println(it) }


    println("------------------------")

    functionaries.add(jose)
    functionaries.forEach{println(it)}

    println("-------------------------")

    functionaries.remove(joao)
    functionaries.forEach{ println(it)}
}