package masyvai_LT;

import static masyvai_LT.uzd_9.random;

public class uzd_11 {
    public static void main(String[] args) {
        int b = 20;
        int[] arrB = new int[b];

        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = random(0, 20);
        }
        int count = 0;
        int suma = 0;
        for (int i = 0; i < arrB.length; i++) {
            if (arrB[i] % 3 == 0) {
                count++;
                suma = suma + arrB[i];
            }
        }

        System.out.println("Masyve esanciu skaiciu kiekis kurie dalinasi is 3 - " + count + ", masyve esanciu skaiciu suma, kurie dalinasi is 3 - " + suma);
    }

}
