package Problem3

import static java.lang.System.nanoTime

class Problem3_Groovy {
    static void main(String[] args) {
        def number = 600851475143
//        def value = 1
//        def maxFactor = 0
//        while (number != 1) {
//            ++value
//            if (number % value == 0 && isPrime(value)) {
//                number = Long.valueOf((number / value).toString())
//                maxFactor = value
//                println value
//                value = 1
//            }
//        }
        def startTime = nanoTime()
        print(
                (2..(number/4)).findAll {
                    isPrime(it)
                }
        )


        print(nanoTime() - startTime)
    }

    static isPrime(number) {
        if (number <= 1L) false
        if (number == 2L) true
        (3..(number / 2)).step(2).findAll {
            !(number % it)
        }.isEmpty()

    }
}
