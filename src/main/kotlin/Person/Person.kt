package Person

class Person(val name: String, val lastName: String) {
    fun GetFullName(): String {
        return ("$name $lastName")
    }

    fun GetFirstName(): String {
        return name
    }

    fun GetLastName(): String {
        return lastName
    }
}