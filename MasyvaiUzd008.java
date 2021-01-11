//Exercise 8
//Sukurkite tris sveikųjų skaičių masyvus, kurių pavadinimai arr1,
//arr2, arr3 ir jie gali  išsaugoti po 5 reikšmes, t.y. n = 5.
//Masyvų arr1 ir arr2 elementų reikšmes priskirkite cikle  (įvedama vartotojo).
//Masyvo arr3 elementų reikšmės bus kitų dviejų masyvų atitinkamų  elementų reikšmių sandaugos,
//t.y. arr3[0] = arr1[0] * arr2[0]. Veiksmus atlikite cikle ir  atspausdinkite masyvo arr3 elementų reikšmes.
//Jeigu pirmojo masyvo elementų reikšmės: 1, 1, 1, 1, 1, o antrojo: 5, 4, 3, 2, 1, tai trečiojo  masyvo elementų reikšmės: 5, 4, 3, 2, 1.

import java.util.Scanner;

public class MasyvaiUzd008 {

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

        System.out.println ("trecias masyvas");
        int[] arr3 = new int[5];
        for (int k=0; k<5; k++) {
            arr3[k] = (arr1[k] * arr2[k]);
        }
        for (int l=0; l<5; l++) {
            System.out.print(arr3[l]+ " ");
        }
        reader.close();
    }
}

