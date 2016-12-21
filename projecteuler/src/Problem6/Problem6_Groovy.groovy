package Problem6

class Problem6_Groovy {
    static void main(String[] args) {
        def range = 1..100
        print squareOfSum(range) - sumOfSquare(range)
    }

    static squareOfSum(IntRange range){
        def sum = 0
        range.each {
            sum += it
        }
        sum**2
    }

    static sumOfSquare(IntRange range){
        def sum = 0
        range.each {
            sum += it**2
        }
        sum
    }
}
