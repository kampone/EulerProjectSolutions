package Problem1

import java.util.stream.Collectors

import static java.util.stream.Collectors.toList


class Problem1_Groovy {
    static void main(String[] args) {
        print findNumberOfIntegersMultipliesMultipliers((1..<1000), [3, 5])
    }

    static findNumberOfIntegersMultipliesMultipliers(IntRange range, List<Integer> multipliers){
        range.stream().filter{
            number ->
                multipliers.stream().map{
                    !(number % it)
                }.any {it}
        }.collect(toList()).sum()
    }
}
