package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_20 {
    public static void main(String[] args) {

        int[] ivertinimai = new int[8];

        for (int i = 0; i < ivertinimai.length; i++) {
            ivertinimai[i] = random(0, 10);
        }

        Arrays.sort(ivertinimai);
        System.out.println(Arrays.toString(ivertinimai));

        int suma = 0;
        for (int i = 1; i < ivertinimai.length - 1; i++) {
          suma = suma + ivertinimai[i];
        }
        System.out.println(suma);

        double vidurkis = 0;
        vidurkis = (double) suma / (ivertinimai.length - 2);
        System.out.printf("Galutinis ivertinimas yra: %.2f", vidurkis);
    }
}
