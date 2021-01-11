package UzdaviniaiMasyvai;
//Exercise 18
//Duotas sveikųjų skaičių masyvas arrT[n] (n=40).
//Šio masyvo elementus patalpinkite į naują masyvą  pradžioje surašydami
//neigiamus elementus, toliau – nulinius ir teigiamus. Surūšiuoti nereikia.

import java.util.Scanner;
public class MasyvaiUzd018 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 40;
        int[] arrT = new int[n];
        int[] arrS = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < n; i++) {
            arrT[i] = getRandom(a, b);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrT[i] + " ");
        }

//        for (int i = 0; i < n; i++) {
//            if (arrT[i])
//        }
//
//        System.out.println(" ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arrS[i] + " ");
//        }
        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}