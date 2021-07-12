package one.digitalinnovation.collections

fun main () {
    val joao = Employee("João", 1500.0, "CLT")
    val maria = Employee("Maria", 5000.0, "PJ")
    val jose = Employee("José", 1200.0, "CLT")

    val repository = Repository<Employee>()


    repository.create(joao.name,joao)
    repository.create(maria.name,maria)
    repository.create(jose.name,jose)


    println(repository.findById(joao.name))
println("-------------------------------")
    repository.findAll().forEach{ println(it)}

    println("-------------------------------")
    repository.remove(joao.name)
    repository.findAll().forEach{ println(it)}

}
