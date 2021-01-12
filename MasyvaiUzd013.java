package UzdaviniaiMasyvai;
//Exercise 13
//Duotas sveikųjų skaičių masyvas arrD[n] (n=20).
//Parašykite programą, kuri šio masyvo teigiamus  elementus
//surašytų į masyvą arrE[m] ir atspausdintų šį masyvą.

import java.util.Scanner;
public class MasyvaiUzd013 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 20;
        int[] arrD = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        int counter=0;

        for (int i = 0; i < n; i++) {
            arrD[i] = getRandom(a, b);
            if (arrD[i]>0){
              counter++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrD[i] + " ");
        }

        int[] arrE = new int [counter];

        for (int i=0; i<counter;i++) {
            if (arrD[i]>0) {
                arrE[i]=arrD[i];
            } else if (arrD[i]<=0) {
                arrE[i]=arrD[i+1];
            }
        }


        System.out.println(" ");
        for (int i = 0; i < counter; i++) {
            System.out.print(arrE[i] + " ");
        }
        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}