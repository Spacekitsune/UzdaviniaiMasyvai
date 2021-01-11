//Exercise 6
//Sukurkite sveikųjų skaičių masyvą pavadinimu array,
//kuris gali išsaugoti 6 reikšmes, t.y. n  = 6.
//Masyvo elementų reikšmes priskirkite cikle (įvedama vartotojo).

import java.util.Scanner;
public class MasyvaiUzd006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Iveskite skaičių: ");

        int num = reader.nextInt();

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + num + " ");
        }
        reader.close();
    }

}
