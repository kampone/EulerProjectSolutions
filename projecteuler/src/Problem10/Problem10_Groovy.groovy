package Problem10

import Problem3.Problem3_Groovy

/**
 * Created by Vladislav on 07.05.2016.
 */
class Problem10_Groovy {
    static void main(String[] args) {
        print findSumPrimeNumbersWithBorder(2*10**6)
    }

    static findSumPrimeNumbersWithBorder(long border){
        def temp = 1L
        BigInteger sum = 0
        while(temp < border){
            if (Problem3_Groovy.isPrime(temp)){
                sum += temp
            }
        }
        sum
    }
}
