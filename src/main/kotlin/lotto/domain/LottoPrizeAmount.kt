package lotto.domain

enum class LottoPrizeAmount(val num: Int, val price: Int) {
    THREE(3, 5000),
    FOUR(4, 50000),
    FIVE(5, 1500000),
    SIX(6, 2000000000);

    companion object {
        private val priceMap = values().associateBy(LottoPrizeAmount::num, LottoPrizeAmount::price)
        fun of(num: Int): Int = priceMap[num] ?: 0
    }
}
