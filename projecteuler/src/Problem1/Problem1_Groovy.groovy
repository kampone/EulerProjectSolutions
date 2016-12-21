package Problem1


class Problem1_Groovy {
    static void main(String[] args) {
        print findNumberOfIntegersThatMultipliesOfAorB(1000, 3, 5)
    }

    static findNumberOfIntegersThatMultipliesOfAorB(int border, int a, int b){
        int sum = 0
        (1..<border).each {
            if (it % a == 0 || it % b == 0) sum += it
        }
        sum
    }
}
