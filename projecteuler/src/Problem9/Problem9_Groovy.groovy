package Problem9

import static java.lang.Long.valueOf

class Problem9_Groovy {
    static void main(String[] args) {
        def map = findPythagoreanTripletValuesWithSum(1000)
        println map
        print valueOf(map['a'].toString()) * valueOf(map['b'].toString()) * valueOf(map['c'].toString())
    }

    static findPythagoreanTripletValuesWithSum(long sum){
        def result
        for (long a = 1; a < sum; a++) {
            for (long b = 1; b < sum; b++) {
                for (long c = 1; c < sum; c++) {
                    if (a+b+c == sum && a**2 + b**2 == c**2){
                        result = [a: a, b: b, c: c]
                        return result
                    }
                }
            }
        }
        result
    }

}
