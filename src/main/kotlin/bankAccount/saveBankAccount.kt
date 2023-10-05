package bankAccount

import person.Person

class SaveBankAccount(
    owner: Person,
    bankAccountNumber: String,
    balance: Double,
) : BaseBankAccount(owner, bankAccountNumber, balance), InterestAccount {}