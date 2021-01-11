
//Exercise 7
//Sukurkite du sveikųjų skaičių masyvus,
//kurių pavadinimai arr1 ir arr2 ir jie gali išsaugoti po  5 reikšmes,
//t.y. n = 5. Masyvo elementų reikšmes priskirkite cikle (įvedama vartotojo).
//Sudėkite tose pačiose masyvų vietose esančias elementų reikšmes ir jas atspausdinkite.

import java.util.Scanner;

public class MasyvaiUzd007 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] arr1 = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Iveskite masyvo elemento reikšmę:");
            int num = reader.nextInt();
            arr1[i] = num;
        }

        System.out.println ("antras masyvas");

        int[] arr2 = new int[5];
        for (int j = 0; j < 5; j++) {

            System.out.print("Iveskite masyvo elemento reikšmę:");
            int num2 = reader.nextInt();
            arr2[j] = num2;
        }
        for (int k=0; k<5; k++) {
            System.out.print(arr1[k] + arr2[k] + " ");
        }


        reader.close();
    }

}
