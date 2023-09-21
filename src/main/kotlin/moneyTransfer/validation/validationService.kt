package moneyTransfer.validation

import bankAccount.BaseBankAccount

class ValidationService {
    fun validateMoneyWithdrawal(amount: Double, sourceBaseBankAccount: BaseBankAccount) {
        if (sourceBaseBankAccount.getBalance() < amount) {
            throw Exception("Insufficient funds")
        }
    }
}