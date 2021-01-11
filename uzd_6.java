package masyvai_LT;

import java.util.Arrays;
import java.util.Scanner;

public class uzd_6 {
    public static void main(String[] args) {

        int[] array = new int[6];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Iveskite skaiciu");
            int x = reader.nextInt();
            array[i] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
