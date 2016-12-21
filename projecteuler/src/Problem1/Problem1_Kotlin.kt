package Problem1

data class Multipliers(val first: Int,val second: Int)
fun main(args: Array<String>) {
    print(
            findNumberOfIntegersThatMultipliesMultipliers(
                    Multipliers(3,5),
                    1 until 1000
            )
    )
}

fun findNumberOfIntegersThatMultipliesMultipliers(multipliers: Multipliers, range: IntRange) : Int {
    return range.filter {
        it % multipliers.first == 0 ||
                it % multipliers.second  == 0
    }.sum()
}