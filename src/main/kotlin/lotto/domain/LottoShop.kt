package lotto.domain

object LottoShop {
    fun getLottoNumbers(amount: Money): List<List<Int>> {
        val count = getNumberOfPurchase(amount)
        return List(count) { generateLottoNumbers() }
    }

    private fun getNumberOfPurchase(amount: Money): Int {
        return amount / Money.UNIT
    }

    private fun generateLottoNumbers(): List<Int> {
        val allNumbers = (1..45).toList()
        val lottoNumbers = allNumbers.shuffled().subList(0, 6)
        return lottoNumbers.sorted()
    }
}
