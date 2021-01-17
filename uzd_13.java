package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_13 {
    public static void main(String[] args) {
        int n = 20;
        int[] arrD = new int[n];
        for (int i = 0; i < arrD.length; i++) {
            arrD[i] = random(-10, 20);
        }
        System.out.println(Arrays.toString(arrD));
        int ilgis = 0;
        for (int i = 0; i < arrD.length; i++) {
            if (arrD[i] > 0) {
                ilgis++;
            }
        }
        int[] arrE = new int[ilgis];
        int ismestiElementai = 0;
        for (int i = 0; i < arrD.length; i++) {
            if (arrD[i] > 0) {
                arrE[i - ismestiElementai] = arrD[i];
            } else {
                ismestiElementai++;
            }
        }


        System.out.println(Arrays.toString(arrE));
    }

}
