package Problem3

import Problem3.Problem3_Groovy.isPrime

val number: Long = 600851475143
val n: Long = 2
fun main(args: Array<String>) {
    print(((19  downTo 1 step 2)).find {
        it ->
        isPrime(it) as Boolean
    })
}



