package lotto.domain

interface NumbersGenerator {
    fun values(): List<Int>
    companion object {
        const val START_IDX = 1
        const val END_IDX = 45
    }
}
