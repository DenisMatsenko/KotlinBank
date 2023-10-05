package interest

import bankAccount.BaseBankAccount
import bankAccount.SaveBankAccount
import bankAccount.StudentBankAccount
import moneyTransfer.fee.InterestConfigService

class CalcInterestService {
    fun calculateInterest(bankAccount: BaseBankAccount): Double {

        val interestConfig = InterestConfigService(bankAccount)
        val percent = interestConfig.getInterestPercent()

        when(bankAccount) {
            is StudentBankAccount -> {
                return bankAccount.getBalance() * percent
            }
            is SaveBankAccount -> {
                return bankAccount.getBalance() * percent
            }
            else -> {
                return 0.0
            }
        }

    }
}