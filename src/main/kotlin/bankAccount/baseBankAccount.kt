package bankAccount

import person.Person

open class BaseBankAccount(
    private val owner: Person,
    private val bankAccountNumber: String,
    private var balance: Double
    ) {

    fun getBalance(): Double {
        return balance
    }

    fun getOwner(): Person {
        return owner
    }

    open fun setBalance(balance: Double) {
        this.balance = balance
    }
}