package UzdaviniaiMasyvai;
//Exercise 22
//Duotas sveikųjų skaičių masyvas arrN[n] (n=20). Parašykite programą,
//kuri patikrintų ar šiame  masyve yra neigiamų elementų.
//Jei yra – tai suskaičiuokite kiek jų yra.
//
//Jei yra neigiamų elementų programos rezultatas:
//Pirmoje eilutėje – žodis TAIP;
//Antroje eilutėje – atspausdinti visi neigiami elementai;
//Trečioje eilutėje – neigiamų elementų kiekis
//Jei nėra neigiamų elementų programos rezultatas žodis NE.

import java.util.Arrays;
import java.util.Scanner;

public class MasyvaiUzd022 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 20;
        int[] arrN = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        int counter = 0;

        for (int i = 0; i < n; i++) {
            arrN[i] = getRandom(a, b);
            if (arrN[i] < 0) {
                counter++;
            }
        }

        int[] negative = new int[counter];

        for (int i = 0; i < negative.length; i++) {

            for (int j = 0; j < arrN.length; j++) {
                if (arrN[j] < 0) {
                    negative[i]=arrN[j];
                    i++;
                }
            }
        }

        if (counter==0) {
            System.out.println("NE.");
        } else {
            System.out.println("Taip.");
            System.out.println(Arrays.toString(negative));
            System.out.printf("Neigiamų elementų kiekis: %d.", counter);
        }

        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
