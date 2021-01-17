package masyvai_LT;

import java.util.Arrays;
import java.util.Scanner;

import static masyvai_LT.uzd_9.random;

public class uzd_12 {
    public static void main(String[] args) {
        int n = 30;
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite k-taji nari ");
        int a = reader.nextInt();
        int[] arrC = new int[n];

        for (int i = 0; i < arrC.length; i++) {
            arrC[i] = random(0, 100);
        }
        arrC[a - 1] = 100;
        System.out.println(Arrays.toString(arrC));
    }
}
