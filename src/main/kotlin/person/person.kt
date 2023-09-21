package person

class Person(private val name: String, private val lastName: String) {
    fun getFullName(): String {
        return ("$name $lastName")
    }

    fun getFirstName(): String {
        return name
    }

    fun getLastName(): String {
        return lastName
    }
}