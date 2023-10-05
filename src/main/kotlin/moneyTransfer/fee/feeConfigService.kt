package moneyTransfer.fee

import bankAccount.BaseBankAccount
import bankAccount.SaveBankAccount
import bankAccount.StudentBankAccount

class FeeConfigService(bankAccount: BaseBankAccount) {
    private val BASE_PERCENT_FEE_LIMIT = 1000
    private val BASE_PERCENT_FEE_UNDER_LIMIT = 0.05
    private val BASE_PERCENT_FEE_OVER_LIMIT = 0.06

    private val STUDENT_PERCENT_FEE_LIMIT = 1000
    private val STUDENT_PERCENT_FEE_UNDER_LIMIT = 0.0
    private val STUDENT_PERCENT_FEE_OVER_LIMIT = 0.0

    private val SAVE_PERCENT_FEE_LIMIT = 1000
    private val SAVE_PERCENT_FEE_UNDER_LIMIT = 0.1
    private val SAVE_PERCENT_FEE_OVER_LIMIT = 0.2

    private val percentFeeLimit: Double
    private val percentFeeUnderLimit: Double
    private val percentFeeOverLimit: Double

    //* This is a constructor
    init {
        when(bankAccount) {
            is StudentBankAccount -> {
                percentFeeLimit = STUDENT_PERCENT_FEE_LIMIT.toDouble()
                percentFeeUnderLimit = STUDENT_PERCENT_FEE_UNDER_LIMIT
                percentFeeOverLimit = STUDENT_PERCENT_FEE_OVER_LIMIT
            }
            is SaveBankAccount -> {
                percentFeeLimit = SAVE_PERCENT_FEE_LIMIT.toDouble()
                percentFeeUnderLimit = SAVE_PERCENT_FEE_UNDER_LIMIT
                percentFeeOverLimit = SAVE_PERCENT_FEE_OVER_LIMIT
            }
            else -> {
                percentFeeLimit = BASE_PERCENT_FEE_LIMIT.toDouble()
                percentFeeUnderLimit = BASE_PERCENT_FEE_UNDER_LIMIT
                percentFeeOverLimit = BASE_PERCENT_FEE_OVER_LIMIT
            }
        }
    }

    fun getPercentFeeLimit(): Double {
        return percentFeeLimit
    }

    fun getPercentFeeUnderLimit(): Double {
        return percentFeeUnderLimit
    }

    fun getPercentFeeOverLimit(): Double {
        return percentFeeOverLimit
    }

}