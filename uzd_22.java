package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_22 {
    public static void main(String[] args) {
        int n = 20;
        int[] arrN = new int[n];

        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = random(-200, 200);
        }
        System.out.println(Arrays.toString(arrN));

        int neigiamuSkaiciuKiekis = 0;
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i] < 0) {
                neigiamuSkaiciuKiekis++;
            }
        }

        if (neigiamuSkaiciuKiekis > 0 ) {
            System.out.println("Taip");
            for (int i = 0; i < arrN.length; i++) {
                if (arrN[i] < 0) {
                    System.out.print(arrN[i] + ", ");
                }
            }
            System.out.println();
            System.out.println("Neigiamu skaiciu kiekis: " + neigiamuSkaiciuKiekis);
        } else {
            System.out.println("Ne");
        }

    }
}