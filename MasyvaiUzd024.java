package UzdaviniaiMasyvai;
//Exercise 24
//Duotas sveikųjų skaičių masyvas arrS(n) (n=10). Raskite pirmo neigiamo masyvo elemento numerį.

import java.util.Arrays;
import java.util.Scanner;

public class MasyvaiUzd024 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 10;
        int[] arrS = new int[n];


        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i=0; i< arrS.length; i++) {
            arrS[i]=getRandom(a,b);
        }

        System.out.println(Arrays.toString(arrS));

        int negative=0;
        int counter=0;

        for (int i = 0; i < arrS.length; i++) {

            if (arrS[i]<negative){
                negative=arrS[i];
                break;
            }
            counter++;
        }
        if (counter<0) {
            System.out.println("Masyvas neturi neigiamų reikšmių.");
        } else {
            System.out.printf("Pirmas neigiamas sk. yra %d . Jis yra %d elemento nr.", negative, counter);
        }
        reader.close();
    }

    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
