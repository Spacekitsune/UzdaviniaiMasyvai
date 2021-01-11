package UzdaviniaiMasyvai;
//Exercise 12
//Parašykite programą, kuri masyvo arrC[n] (n=30),
//k-tąjį (įvedama vartotojo) elementą pakeistų reikšme 100.
//Atspausdinkite šį pakeistą masyvą.

import java.util.Scanner;
public class MasyvaiUzd012 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 30;
        int[] arrC = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < n; i++) {
            arrC[i] = getRandom(a, b);
        }
        System.out.print("Iveskite k: ");
        int k = reader.nextInt();

        arrC[k-1]=100;

        for (int l = 0; l < n; l++) {
            System.out.print(arrC[l] + " ");
        }

        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
