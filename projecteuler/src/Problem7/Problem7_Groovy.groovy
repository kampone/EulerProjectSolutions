package Problem7

import Problem3.Problem3_Groovy


class Problem7_Groovy {
    static findPrimeNumberWithNumber(long n){
        def numberOfPrimeNumber = 0
        def temp = 0
        while (numberOfPrimeNumber != n){
            temp++
            if (Problem3_Groovy.isPrime(temp)){
                ++numberOfPrimeNumber
            }
        }
        temp
    }

    static void main(String[] args) {
        print findPrimeNumberWithNumber(10001)
    }
}
