package UzdaviniaiMasyvai;
//Exercise 23
//Duotas sveikųjų skaičių masyvas arrL[n] (n=20).
//Parašykite programą, kuri prieš paskutinį masyvo  elementą įterptų pirmąjį masyvo elementą.
//Pirmasis elementas turi išlikti. Atspausdinkite tokį  pakeistą masyvą (galima naudoti pagalbinį masyvą).

import java.util.Arrays;
import java.util.Scanner;
public class MasyvaiUzd023 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 20;
        int[] arrL = new int[n];
        int[] ats= new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i=0; i< arrL.length; i++) {
            arrL[i]=getRandom(a,b);
        }

        System.out.println(Arrays.toString(arrL));

        int temp=arrL[arrL.length-2];

        for (int i = 1; i < ats.length; i++) {

            for (int j = 0; j < arrL.length; j++) {
                if (j!=arrL.length-2) {
                    ats[i]=arrL[j];
                    i++;
                }
            }
        }

        ats[0]=temp;

        System.out.println(Arrays.toString(ats));
        reader.close();
    }

    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));
    }
}
