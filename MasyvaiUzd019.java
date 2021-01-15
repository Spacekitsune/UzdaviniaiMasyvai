package UzdaviniaiMasyvai;
//Exercise 19
//Duotas sveikųjų skaičių masyvas arrZ[n] (n=70).
//Raskite didžiausią ir mažiausią jo elementus bei jų eilės numerius.

import java.util.Scanner;

public class MasyvaiUzd019 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 70;
        int[] arrZ = new int[n];


        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        int min=0;
        int max=0;
        int minI=0;
        int maxI=0;

        for (int i = 0; i < arrZ.length; i++) {
            arrZ[i] = getRandom(a, b);
        }

        for (int i = 0; i < arrZ.length; i++) {
            if (arrZ[i]>=max) {
                max=arrZ[i];
                maxI=i;
            }
        }

        for (int i = 0; i < arrZ.length; i++) {
            if (arrZ[i]<=min) {  //jei mažiausia masyvo reikšmė 0, tada nepasikeičia minI vertė.
                min=arrZ[i];
                minI=i;
            }
        }

        for (int k : arrZ) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.printf("Didžiausia masyvo reikšmė yra %d, kuri yra %d vietoje. Mažiausia : %d, kuri yra %d vietoje.", max, maxI, min, minI);

        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
