package lotto.domain

object LottoShop {
    fun getLottoNumbers(amount: Money): List<LottoNumbers> {
        val count = getNumberOfPurchase(amount)
        return List(count) { generateLottoNumbers() }
    }

    private fun getNumberOfPurchase(amount: Money): Int {
        return amount / Money.UNIT
    }

    private fun generateLottoNumbers(): LottoNumbers {
        val lottoNumbers = (1..45).shuffled().take(6).sorted()
        val lottoNumbersSet = lottoNumbers.map { LottoNumber.of(it) }.toSet()
        return LottoNumbers.of(lottoNumbersSet)
    }
}
