package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_24 {
    public static void main(String[] args) {
        int n = 10;
        int[] arrS = new int[n];

        for (int i = 0; i < arrS.length; i++) {
            arrS[i] = random(-200, 200);
        }
        System.out.println(Arrays.toString(arrS));

        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i] < 0) {
                System.out.println("Masyvo elemento numaris: " + i);
                break;
            }
        }
    }
}