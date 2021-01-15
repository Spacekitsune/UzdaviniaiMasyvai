package UzdaviniaiMasyvai;
//Exercise 25
//Duotas sveikųjų skaičių masyvas arrP(n) (n=20).
//Surikiuokite masyvo elementus didėjimo tvarka.
//Išbandykite kelis rūšiavimo algoritmus.
//Bubble Sort
//Selection Sort

import java.util.Arrays;
import java.util.Scanner;

public class MasyvaiUzd025 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 20;
        int[] arrP = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < arrP.length; i++) {
            arrP[i] = getRandom(a, b);
        }

        System.out.println(Arrays.toString(arrP));


        //Bubble sort
        bubbleSort(arrP);
        printArray(arrP);

        //Selection Sort

        int len = arrP.length;

        for (int i = 0; i < len-1; i++)
        {
            // Finding the minimum element in the unsorted part of array
            int min = i;
            for (int j = i+1; j < len; j++)
                if (arrP[j] < arrP[min])
                    min = j;

            /* Swapping the found minimum element with the first
             * element of the sorted subarray using temp variable
             */
            int temp = arrP[min];
            arrP[min] = arrP[i];
            arrP[i] = temp;
        }

        System.out.println(Arrays.toString(arrP));

        reader.close();
    }

    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }

    public static int[] bubbleSort(int[] A) {
        for (int i=0; i<A.length-1; i++) {
            for(int j=0; j<A.length-1-i;j++) {
                if(A[j]> A[j+1]){
                    int temp= A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
        }
        return A;
    }
    public static void printArray(int[] A) {
        System.out.println(Arrays.toString(A));
        }
}
