package interest

import bankAccount.BaseBankAccount

class ApplayInterestService {
    fun applayInterest(bankAccount: BaseBankAccount, interest: Double) {
        bankAccount.setBalance(bankAccount.getBalance() + interest)
    }
}