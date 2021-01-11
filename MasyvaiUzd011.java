package UzdaviniaiMasyvai;
//Exercise 11
//Duotas sveikųjų skaičių masyvas arrB[n] (n=20).
//Parašykite programą, kuri suskaičiuotų kiek masyve  yra skaičių,
//kurie dalinasi iš trijų bei apskaičiuotų masyvo elementų, kurie dalijasi iš 3 sumą.

import java.util.Scanner;
public class MasyvaiUzd011 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 20;
        int[] arrB = new int[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        int div3counter=0;
        int div3sum=0;

        for (int i = 0; i < n; i++) {
            arrB[i] = getRandom(a, b);
            if (arrB[i]%3==0){
                div3counter++;
                div3sum=div3sum+arrB[i];
            } else {
                continue;
            }
        }
        System.out.println("Masyve yra "+div3counter+" skaičiai, kurie dalijasi iš 3");
        System.out.println("Bendra skaičių, kurie dalijasi iš 3, suma yra: "+div3sum);
        for (int l = 0; l < n; l++) {
            System.out.print(arrB[l] + " ");
        }
        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
