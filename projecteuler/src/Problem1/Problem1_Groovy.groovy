package Problem1;


public class Problem1_Groovy {
    public static void main(String[] args) {
        System.out.println(findNumberOfIntegersThatMultipliesOfAorB(1000, 3, 5));
    }

    def static findNumberOfIntegersThatMultipliesOfAorB(int border, int a, int b){
        int sum = 0;
        (1..<border).each {
            if (it % a == 0 || it % b == 0) sum += it;
        }
        sum
    }
}
