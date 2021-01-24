package masyvai_LT;

import java.util.Arrays;
import java.util.Scanner;

public class uzd_9 {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
        int sk = random(c, d);
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite intervalo pradzia ");
        int pradzia = reader.nextInt();

        System.out.println("Iveskite intervalo pabaiga ");
        int pabaiga = reader.nextInt();

        System.out.println("Iveskite kokio dydzio masyvas (n) ");
        int n = reader.nextInt();
        int[] masyvas = new int[n];

        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = random(pradzia, pabaiga);
        }
        System.out.println(Arrays.toString(masyvas));
    }

    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
