package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_16 {

    public static void main(String[] args) {
        int n = 20;
        int[] arrG = new int[n];

        for (int i = 0; i < arrG.length; i++) {
            arrG[i] = random(0, 200);
        }

        int trinamasElementas = 4;
        int[] arrH = new int[n - 1];
        for (int i = 0; i < arrH.length; i++) {
            if (i >= trinamasElementas - 1) {
                arrH[i] = arrG[i + 1];
            } else {
                arrH[i] = arrG[i];
            }
        }
        System.out.println(Arrays.toString(arrG));
        System.out.println(Arrays.toString(arrH));
    }

}
