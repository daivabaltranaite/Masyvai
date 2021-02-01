package masyvai_LT;

import java.util.Arrays;

import static masyvai_LT.uzd_9.random;

public class uzd_25 {
    public static void main(String[] args) {
        int n = 20;
        int[] arrS = new int[n];
        int[] arrZ = new int[n];

        for (int i = 0; i < arrS.length; i++) {
            arrS[i] = random(-200, 200);
        }
        for (int i = 0; i < arrZ.length; i++) {
            arrZ[i] = random(-200, 200);
        }
        System.out.println(Arrays.toString(arrS));
        bubbleSort(arrS);
        System.out.println("bubbleSort rusiavimas: " + Arrays.toString(arrS));

        System.out.println(Arrays.toString(arrZ));
        selectionSort(arrZ);
        System.out.println("selectionSort rusiavimas: " + Arrays.toString(arrZ));
    }

        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }


}
