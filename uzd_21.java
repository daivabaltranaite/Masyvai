package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_21 {
    public static void main(String[] args) {
        int n = 30;
        int[] pazymiai = new int[n];

        for (int i = 0; i < pazymiai.length; i++) {
            pazymiai[i] = random(1, 10);
        }
        System.out.println(Arrays.toString(pazymiai));

        int neislaike = 0;
        int suma = 0;
        for (int i = 0; i < pazymiai.length; i++) {
            if (pazymiai[i] < 4) {
                neislaike++;
            } else {
                suma = pazymiai[i] + suma;
            }
        }
        System.out.println("Neislaikiusiu skaicius: " + neislaike);
        System.out.printf("Vidurkis: %.2f", (double) suma / (double) (n - neislaike));
    }
}
