package ch01.ex1_ATasteOfKotlin

data class Person(val name: String,
                  val email: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", "alice@mgail.com", 35),
                         Person("Lucy", "lucy@gmail.com", 30),
                         Person("Bob", "bob@gmail.com", 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
    
    val younger = persons.minBy { it.age ?: 0 }
    println("The younger is: $younger")
    
}

/*  The oldest is: Person(name=Alice, email=alice@mgail.com, age=35)
	The younger is: Person(name=Bob, email=bob, age=29)
*/