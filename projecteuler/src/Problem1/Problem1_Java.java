package Problem1;

/**
 * Created by Vladislav on 25.04.2016.
 */
public class Problem1_Java {
    public static void main(String[] args) {
        System.out.println(findNumberOfIntegersThatMultiplyAorB(1000, 3, 5));
    }

    public static int findNumberOfIntegersThatMultiplyAorB(int border, int a, int b){
        int sum = 0;
        for(int i = 1; i < border; i++){
            if (i % a == 0 || i % b == 0){
                sum+=i;
            }
        }
        return sum;
    }
}
