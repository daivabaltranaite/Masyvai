package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_15 {
    public static void main(String[] args) {
        int n = 200;
        double[] prekes = new double[n];

        for (int i = 0; i < prekes.length; i++) {
            prekes[i] = random(0, 1000);
        }
        double suma = 0;

        for (int i = 0; i < prekes.length; i++) {
            suma = suma + prekes[i];
        }

        double vidurkis = suma / prekes.length;
        double procentai = 1.05;
        System.out.println(Arrays.toString(prekes));
        System.out.println(vidurkis);
        for (int i = 0; i < prekes.length; i++) {
            if (prekes[i] > vidurkis) {
                prekes[i] = prekes[i] * procentai;
            }
        }

        System.out.println(Arrays.toString(prekes));
    }
}
