package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_18 {
    public static void main(String[] args) {
        int n = 40;
        int[] arrT = new int[n];

        for (int i = 0; i < arrT.length; i++) {
            arrT[i] = random(-200, 200);
        }
        int irasytuSkaiciuKiekis = 0;
        int[] naujasMasyvas = new int[n];
        for (int i = 0; i < arrT.length; i++) {
            if (arrT[i] < 0) {
                naujasMasyvas[irasytuSkaiciuKiekis] = arrT[i];
                irasytuSkaiciuKiekis++;
            }
        }
        for (int i = 0; i < arrT.length; i++) {
            if (arrT[i] == 0) {
                naujasMasyvas[irasytuSkaiciuKiekis] = arrT[i];
                irasytuSkaiciuKiekis++;
            }
        }
        for (int i = 0; i < arrT.length; i++) {
            if (arrT[i] > 0) {
                naujasMasyvas[irasytuSkaiciuKiekis] = arrT[i];
                irasytuSkaiciuKiekis++;
            }
        }
        System.out.println(Arrays.toString(arrT));
        System.out.println(Arrays.toString(naujasMasyvas));
    }

}
