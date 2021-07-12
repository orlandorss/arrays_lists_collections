package one.digitalinnovation.collections



data class Employee(
    val name:String,
    val salary: Double,
    val contract:String
){
    override fun toString(): String =
        """
            Name: $name
            Salary: $salary
                    
        """.trimIndent()
}