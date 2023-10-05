import bankAccount.BaseBankAccount
import bankAccount.InterestAccount
import bankAccount.SaveBankAccount
import bankAccount.StudentBankAccount
import interest.ApplayInterestService
import interest.CalcInterestService
import moneyTransfer.MoneyTransferService
import person.Person

class Bank {
    private val moneyTransferService = MoneyTransferService()
    private val calcInterestService = CalcInterestService()
    private val applayInterestService = ApplayInterestService()


    fun run() {
        val bankAccounts = mutableListOf<BaseBankAccount>()

        val person = Person("Denis", "Matsenko")
        val bankAcc1 = StudentBankAccount(person, "1234567890", 2000.0)
        val bankAcc2 = SaveBankAccount(person, "1234567890", 5000.0)


        val person2 = Person("Roman", "Matsenko")
        val bankAcc3 = BaseBankAccount(person2, "0987654321", 0.0)

        bankAccounts.add(bankAcc1)
        bankAccounts.add(bankAcc2)
        bankAccounts.add(bankAcc3)

        printAccounts(bankAccounts)

        for (bankAccount in bankAccounts) {
            if (bankAccount is InterestAccount) {
                val interest = calcInterestService.calculateInterest(bankAccount)
                applayInterestService.applayInterest(bankAccount, interest)
            }
        }

        printAccounts(bankAccounts)

    }

    fun printAccounts(bankAccounts: MutableList<BaseBankAccount>) {
        for (bankAccount in bankAccounts) {
            println(bankAccount.getOwner().getFullName() + ": " + bankAccount.getBalance())
        }
    }
}