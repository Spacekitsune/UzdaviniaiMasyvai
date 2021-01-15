package UzdaviniaiMasyvai;
//Exercise 18
//Duotas sveikųjų skaičių masyvas arrT[n] (n=40).
//Šio masyvo elementus patalpinkite į naują masyvą  pradžioje surašydami
//neigiamus elementus, toliau – nulinius ir teigiamus. Surūšiuoti nereikia.

import java.util.Arrays;
import java.util.Scanner;
public class MasyvaiUzd018 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 40;
        int[] arrT = new int[n];
        int[] arrS = new int[arrT.length];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < arrT.length; i++) {
            arrT[i] = getRandom(a, b);
        }

        System.out.println(Arrays.toString(arrT));
        System.out.println("lenght");

        int temp=0;

        for (int i = 0; i < arrS.length; i++) {
            for (int j = 0; j < arrT.length; j++) {
                if (arrT[j] < 0) {
                    temp = arrT[j];
                    arrS[i] = temp;
                    i++;
                }
            }
            for (int j = 0; j < arrT.length; j++) {
                if (arrT[j] == 0) {
                    temp = arrT[j];
                    arrS[i] = temp;
                    i++;
                }
            }

            for (int j = 0; j < arrT.length; j++) {
                if (arrT[j]>0) {
                    temp = arrT[j];
                    arrS[i] = temp;
                    ;
                    i++;
                }
            }
        }

        System.out.println(Arrays.toString(arrS));

        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}