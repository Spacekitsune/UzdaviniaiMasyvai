package UzdaviniaiMasyvai;
//Exercise 14
//Duotas sveikųjų skaičių masyvas arrF[n] (n=25).
//Parašykite programą, kuri sukeistų šio masyvo k-tąjį elementą
//su m-tuoju vietomis ir atspausdintų tokį pakeistą masyvą.

import java.util.Scanner;
public class MasyvaiUzd014 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 25;
        int[] arrF = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < n; i++) {
            arrF[i] = getRandom(a, b);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrF[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Iveskite k skaičių: ");
        int k = reader.nextInt();

        System.out.print("Iveskite m skaičių: ");
        int m = reader.nextInt();

        int temp = arrF[k];
        arrF[k]=arrF[m];
        arrF[m]= temp;

        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrF[i] + " ");
        }
        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
