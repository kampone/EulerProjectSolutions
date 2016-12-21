package Problem3

class Problem3_Groovy {
    static void main(String[] args) {
        def number = 600851475143
        def value = 1
        def maxFactor = 0
        while (number != 1) {
            ++value
            if (number % value == 0 && isPrime(value)) {
                number = Long.valueOf((number / value).toString())
                maxFactor = value
                println value
                value = 1
            }
        }
    }

    static isPrime(long number) {
        if (number == 1L) {
            false
        } else {
            long i = 2
            def flag = true
            while (i**2 <= number && flag) {
                if (number % i == 0) {
                    flag = false
                }
                ++i
            }
            flag
        }
    }
}
