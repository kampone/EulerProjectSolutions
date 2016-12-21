package Problem1

fun main(args: Array<String>) {
    print(
            findNumberOfIntegersThatMultipliesMultipliers(
                    1 until 1000,
                    listOf(3,5)
            )
    )
}

fun findNumberOfIntegersThatMultipliesMultipliers(range: IntRange, multipliers: List<Int>) : Int {
    return range.filter {
        number ->
           multipliers.filter{
               number % it == 0
           }.isNotEmpty()
    }.sum()
}
