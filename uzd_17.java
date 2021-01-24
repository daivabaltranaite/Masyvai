package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_17 {
    public static void main(String[] args) {
        int n = 50;
        int[] arrQ = new int[n];

        for (int i = 0; i < arrQ.length; i++) {
            arrQ[i] = random(0, 200);
        }

        int naujoElementoVieta = 2;
        int naujoElementoReiksme = 2;
        int[] arrY = new int[n + 1];
        for (int i = 0; i < arrY.length; i++) {
            if (i == naujoElementoVieta-1) {
                arrY[i] = naujoElementoReiksme;
            } else if (i > naujoElementoVieta-1) {
                arrY[i] = arrQ[i-1];
            } else {
                arrY[i] = arrQ[i];
            }
        }
        System.out.println(Arrays.toString(arrQ));
        System.out.println(Arrays.toString(arrY));


    }


}
