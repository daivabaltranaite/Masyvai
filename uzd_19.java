package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_19 {
    public static void main(String[] args) {
        int n = 70;
        int[] arrZ = new int[n];

        for (int i = 0; i < arrZ.length; i++) {
            arrZ[i] = random(-200, 200);
        }

        int max = arrZ[0];
        int maxVieta = 0;
        for (int i = 0; i < arrZ.length; i++) {
            if (arrZ[i] > max) {
                max = arrZ[i];
                maxVieta = i;
            }
        }

        int min = arrZ[0];
        int minVieta = 0;
        for (int i = 0; i < arrZ.length; i++) {
            if (arrZ[i] < min) {
                min = arrZ[i];
                minVieta = i;
            }
        }


        System.out.println(Arrays.toString(arrZ));
        System.out.println(max + " " + (maxVieta + 1));
        System.out.println(min + " " + (minVieta + 1));
    }


}
