package Problem2

class Problem2_Groovy {
    public static void main(String[] args) {
        print findSumOfEvenMembersOfFibonacciSequenceWithBorder(4*10**6)
    }

    def static fibo(int n){
        if (n == 0) 1
        else if (n == 1) 1
        else fibo(n-2) + fibo(n-1)
    }

    def static findSumOfEvenMembersOfFibonacciSequenceWithBorder(int border){
        int i = 0
        int fib = 0
        int sum = 0

        while (fib < border) {
            fib = fibo(i)
            if (fib % 2 == 0) sum += fib
            ++i
        }
        sum
    }
}
