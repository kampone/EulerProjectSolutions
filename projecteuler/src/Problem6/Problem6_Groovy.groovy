package Problem6

class Problem6_Groovy {
    public static void main(String[] args) {
        def range = 1..100
        print squareOfSum(range) - sumOfSquare(range)
    }

    def static squareOfSum(IntRange range){
        def sum = 0
        range.each {
            sum += it
        }
        sum**2
    }

    def static sumOfSquare(IntRange range){
        def sum = 0
        range.each {
            sum += it**2
        }
        sum
    }
}
