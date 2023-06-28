package lotto.domain

class RandomNumbersGenerator: NumbersGenerator {
    override fun values(): List<Int> = generate()
    private fun generate(): List<Int> = (NumbersGenerator.START_IDX..NumbersGenerator.END_IDX).shuffled()
}
