package lotto.domain

private const val UNIT = 1000

class LottoPurchaseAmount(amount: Int) {
    init {
        require(amount > 0) {
            "구입 금액은 0 이상이어야 합니다."
        }
        require(amount % UNIT == 0) {
            "$UNIT 단위로 입력해주세요."
        }
    }
}
