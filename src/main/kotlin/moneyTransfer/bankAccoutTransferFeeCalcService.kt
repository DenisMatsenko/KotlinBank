package moneyTransfer

import bankAccount.BaseBankAccount
import moneyTransfer.fee.FeeConfigService

class BankAccountTransferFeeCalcService {
    fun calculateFee(amount: Double, bankAccount: BaseBankAccount): Double {
        val feeConfig = FeeConfigService(bankAccount)

        if (amount < feeConfig.getPercentFeeLimit()) {
            return amount * feeConfig.getPercentFeeUnderLimit()
        }
        return amount * feeConfig.getPercentFeeOverLimit()
    }
}