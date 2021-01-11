package masyvai_LT;

import java.util.Scanner;

public class uzd_5 {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 8, 1, 9, 8, 6, 0, 9, 1, 2, 3, 4, 5};
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite x reiksme");
        int x = reader.nextInt();

        for (int i = 0; i < array.length; i++) {
            int reiksme = array[i] + x;
            System.out.print(reiksme + " ");
        }
    }
}
