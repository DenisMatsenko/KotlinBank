package bankAccount

import person.Person

class StudentBankAccount(
    owner: Person,
    bankAccountNumber: String,
    balance: Double,
) : BaseBankAccount(owner, bankAccountNumber, balance) {}