//Exercise 1
//Sukurkite sveikųjų skaičių masyvą pavadinimu array,
//kuris gali išsaugoti 3 reikšmes, t.y. n  = 3.
//Priskirkite masyvo elementams bet kokias reikšmes ir jį atspausdinkite.

public class MasyvaiUzd001 {

    public static void main(String[] args) {
        int n = 3;
        int[] array = new int[n];

        array[0] = 3;
        array[1] = 6;
        array[2] = 9;

        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
