package lotto.domain

data class Money(val amount: Int) {
    init {
        require(amount > 0) {
            "구입 금액은 0 이상이어야 합니다."
        }
        require(amount % UNIT == 0) {
            "$UNIT 단위로 입력해주세요."
        }
    }

    operator fun div(value: Int): Int {
        return amount / value
    }

    companion object {
        const val UNIT = 1000
    }
}
