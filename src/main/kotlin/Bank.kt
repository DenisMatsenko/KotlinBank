import bankAccount.BaseBankAccount
import bankAccount.StudentBankAccount
import moneyTransfer.MoneyTransferService
import person.Person

class Bank {
    private val moneyTransferService = MoneyTransferService()

    fun run() {
        println("Bank is running")

        val person = Person("John", "Doe")
        val sourceBaseBankAccount = StudentBankAccount(person, "1234567890", 2000.0)
        val destinationBaseBankAccount = BaseBankAccount(person, "0987654321", 0.0)

        moneyTransferService.transferMoney(sourceBaseBankAccount, destinationBaseBankAccount, 1000.0)

        println(sourceBaseBankAccount.getBalance())
        println(destinationBaseBankAccount.getBalance())
    }
}