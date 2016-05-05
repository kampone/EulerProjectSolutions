package Problem3

class Problem3_Groovy {
    public static void main(String[] args) {
        def number = 600851475143
        def value = number - 1
        def maxFactor = 0
        while (maxFactor == 0){
            if (number % value == 0 && isPrime(value)){
                maxFactor = value;
            }
            if(value % 1000000000 == 0){
                print value
            }
            --value
        }
        print(value)
        print isPrime(number)
    }

    def static isPrime(long number){
        long i = 2
        def flag = true;
        while(i**2 <= number && flag){
            if (number % i == 0){
                flag = false
            }
            ++i;
        }
        flag
    }
}
