import BankAccount.BankAccount
import Person.Person

class Bank {
    fun run() {
        println("Bank is running")

        val person = Person("John", "Doe")
        val bankAccount = BankAccount(person, "1234567890", 100.0)

        println(bankAccount.GetBalance())

        bankAccount.AddFunds(100.0)

        println(bankAccount.GetBalance())

        bankAccount.WithdrawFunds(50.0)

        println(bankAccount.GetBalance())
    }
}