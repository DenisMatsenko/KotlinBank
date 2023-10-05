package moneyTransfer

import bankAccount.BaseBankAccount
import moneyTransfer.fee.AtmTransferFeeCalcService
import moneyTransfer.fee.BankAccountTransferFeeCalcService
import moneyTransfer.validation.ValidationService

class MoneyTransferService() {
    private val vs = ValidationService()
    private val accountTransferFeeCalcService = BankAccountTransferFeeCalcService()
    private val atmTransferFeeCalcService = AtmTransferFeeCalcService()

    fun transferMoney(sourceBaseBankAccount: BaseBankAccount, destinationBaseBankAccount: BaseBankAccount, amount: Double){
        val amountWithFee = amount + accountTransferFeeCalcService.calculateFee(amount, sourceBaseBankAccount)
        vs.validateMoneyWithdrawal(amountWithFee, sourceBaseBankAccount)

        sourceBaseBankAccount.setBalance(sourceBaseBankAccount.getBalance() - amountWithFee)
        destinationBaseBankAccount.setBalance(destinationBaseBankAccount.getBalance() + amount)
    }

    fun transferMoneyToATM(sourceBaseBankAccount: BaseBankAccount, amount: Double) {
        var amountWithFee = amount + atmTransferFeeCalcService.calculateFee(amount, sourceBaseBankAccount)
        vs.validateMoneyWithdrawal(amountWithFee, sourceBaseBankAccount)

        sourceBaseBankAccount.setBalance(sourceBaseBankAccount.getBalance() - amount)
    }
}