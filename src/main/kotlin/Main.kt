fun main(args: Array<String>) {

    try {
        val bank = Bank()
        bank.run()
    } catch (e: Exception) {
        println(e.message)
    }
}