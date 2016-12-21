package Problem1


class Problem1_Groovy {
    static void main(String[] args) {
        print findNumberOfIntegersThatMultipliesOfAorB(1000, 3, 5)
    }

    static findNumberOfIntegersThatMultipliesOfAorB(int border, int a, int b){
        (1..<border).findAll {
            !(it % a) || !(it % b)
        }.sum()
    }
}
