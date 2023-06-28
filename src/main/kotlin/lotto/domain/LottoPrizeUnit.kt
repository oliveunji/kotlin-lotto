package lotto.domain

enum class LottoPrizeUnit(val numOfMatchingDigits: Int, val price: Int) {
    THREE(3, 5000),
    FOUR(4, 50000),
    FIVE(5, 1500000),
    SIX(6, 2000000000);

    companion object {
        private val priceMap = values().associateBy(LottoPrizeUnit::numOfMatchingDigits, LottoPrizeUnit::price)
        fun of(numOfMatchingDigits: Int): Int = priceMap[numOfMatchingDigits] ?: 0
    }
}
