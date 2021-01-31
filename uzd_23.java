package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_23 {
    public static void main(String[] args) {
        int n = 20;
        int[] arrL = new int[n];

        for (int i = 0; i < arrL.length; i++) {
            arrL[i] = random(-200, 200);
        }
        System.out.println(Arrays.toString(arrL));

        int[] arrN = new int[n+1];
        arrN[0] = arrL[n - 2];
        for (int i = 1; i < arrN.length; i++) {
            arrN[i] = arrL[i-1];
        }
        System.out.println(Arrays.toString(arrN));

    }
}
