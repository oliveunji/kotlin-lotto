package lotto.domain

data class LottoNumber(val number: Int) {
    init {
        require(number in MIN..MAX) { "로또 번호는 $MIN ~ $MAX 사이여야 합니다. " }
    }
    companion object {
        const val MIN = 1
        const val MAX = 45

        fun of(number: Int): LottoNumber = LottoNumber(number)
    }
}

