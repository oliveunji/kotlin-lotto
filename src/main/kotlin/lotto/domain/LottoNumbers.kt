package lotto.domain

data class LottoNumbers(val numbers: Set<LottoNumber> ) {
    init {
        require(numbers.size == LOTTO_NUMBER_COUNT) { "로또는 6개 숫자만 가질 수 있습니다." }
    }

    fun numbers(): Set<Int> = numbers.map {it.number.toInt() }.toSet()

    fun getLottoWinnersList(lottoNumbers: List<LottoNumbers>): MutableMap<Int, Int> {
        val resultMap = mutableMapOf(
            3 to 0,
            4 to 0,
            5 to 0,
            6 to 0
        )
        lottoNumbers.forEach{
            val matchCount = it.getMatchingCount(numbers.toSet())
            if (matchCount >= 3){
                resultMap.computeIfPresent(matchCount) {_,count -> count+1}
            }
        }
        return resultMap
    }

    private fun getMatchingCount(targetNumbers: Set<LottoNumber>): Int {
        return numbers.intersect(targetNumbers).size
    }

    companion object {
        const val LOTTO_NUMBER_COUNT = 6
        fun of(numbers: Set<LottoNumber>): LottoNumbers = LottoNumbers(numbers)
    }
}

