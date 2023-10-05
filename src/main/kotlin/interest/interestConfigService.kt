package moneyTransfer.fee

import bankAccount.BaseBankAccount
import bankAccount.SaveBankAccount
import bankAccount.StudentBankAccount

class InterestConfigService(bankAccount: BaseBankAccount) {
    private val STUDENT_INTEREST_PERCENT = 0.05
    private val SAVE_INTEREST_PERCENT = 0.1

    private val interestPercent: Double

    //* This is a constructor
    init {
        when(bankAccount) {
            is StudentBankAccount -> {
                interestPercent = STUDENT_INTEREST_PERCENT
            }
            is SaveBankAccount -> {
                interestPercent = SAVE_INTEREST_PERCENT
            }
            else -> {
                interestPercent = 0.0
            }
        }
    }

    fun getInterestPercent(): Double {
        return interestPercent
    }
}