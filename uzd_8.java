package masyvai_LT;

import java.util.Arrays;
import java.util.Scanner;

public class uzd_8 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Iveskite arr1 reiksmes");
            int x = reader.nextInt();
            arr1[i] = x;
        }
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Iveskite arr2 reiksmes");
            int y = reader.nextInt();
            arr2[i] = y;
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr3.length; i++) {
            int sandauga = arr1[i] * arr2[i];
            arr3[i] = sandauga;
        }

        System.out.print("Trecio masyvo elementai " + Arrays.toString(arr3));
    }
}
