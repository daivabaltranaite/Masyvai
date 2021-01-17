package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_14 {
    public static void main(String[] args) {
        int n = 25;
        int[] arrF = new int[n];

        for (int i = 0; i < arrF.length; i++) {
            arrF[i] = random(0, 200);
        }

        System.out.println(Arrays.toString(arrF));
        int k = 5;
        int m = 7;
        int tmp = arrF[k];
        arrF[k] = arrF[m];
        arrF[m] = tmp;

        System.out.println(Arrays.toString(arrF));


    }
}