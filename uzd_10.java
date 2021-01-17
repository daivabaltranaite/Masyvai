package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_10 {
    public static void main(String[] args) {
        int n = 12;
        int[] masyvas = new int[n];

        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = random(0, 20);
        }
        int count = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

}
