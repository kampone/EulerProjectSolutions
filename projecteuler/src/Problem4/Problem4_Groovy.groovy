package Problem4

class Problem4_Groovy {


    static void main(String[] args) {
        print findMaxPolindromFromMultiply(999, 999)
    }

    static findMaxPolindromFromMultiply(long factor1, long factor2){
        def maxPolindrom = 0L
        for (long i = 100; i < factor1; i++) {
            for (long j = 100; j < factor2; j++) {
                if (isPolindrom(i * j) && maxPolindrom < (i * j)){
                    maxPolindrom = i * j
                }
            }
        }
        maxPolindrom
    }

    static isPolindrom(long number){
        def isPolindrom = true
        def stringNumber = number.toString()
        def charArray = stringNumber.toCharArray()

        for (int i = 0; i < charArray.size(); i++) {
            if (charArray[i] != charArray[-i-1]){
                isPolindrom = false
            }
        }
        isPolindrom
    }
}
