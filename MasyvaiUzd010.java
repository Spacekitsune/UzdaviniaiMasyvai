package UzdaviniaiMasyvai;//Exercise 10
//Patikrinkite ar sveikųjų skaičių masyve arrA[n] (n=12) yra nors vienas elementas lygus 0.
//Jei yra tai  suskaičiuokite kiek jų yra.

import java.util.Scanner;
public class MasyvaiUzd010 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 12;
        int[] arrA = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        int zerocounter=0;

        for (int i = 0; i < n; i++) {
             arrA[i] = getRandom(a, b);
             if (arrA[i]==0){
                 zerocounter++;
            } else {
                 continue;
            }
        }
        System.out.println("Masyve yra "+zerocounter+" nuliai");
        for (int l = 0; l < n; l++) {
            System.out.print(arrA[l] + " ");
        }
        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
