package BankAccount

import Person.Person

class BankAccount(
    private val Owner: Person,
    private val BankAccountNumber: String,
    private var Balance: Double
    ) {

    fun AddFunds(amount: Double) {
        Balance += amount
    }

    fun WithdrawFunds(amount: Double) {
        Balance -= amount
    }

    fun GetBalance(): Double {
        return Balance
    }
}