package lotto.domain
private const val LOTTO_NUMBERS_COUNT = 6
object LottoShop {
    fun getLottoNumbers(amount: Money): List<LottoNumbers> {
        val count = getNumberOfPurchase(amount)
        return List(count) { generateLottoNumbers() }
    }

    private fun getNumberOfPurchase(amount: Money): Int {
        return amount / Money.UNIT
    }

    private fun generateLottoNumbers(): LottoNumbers {
        val lottoNumbers = RandomNumbersGenerator().values().take(LOTTO_NUMBERS_COUNT).sorted()
        val lottoNumbersSet = lottoNumbers.map { LottoNumber.of(it) }.toSet()
        return LottoNumbers.of(lottoNumbersSet)
    }
}
