//Exercise 2
//Sukurkite sveikųjų skaičių masyvą pavadinimu array,
//kuris gali išsaugoti 6 reikšmes, t.y. n  = 6.
//Reikšmes masyvui suteikite iš karto – inicijuokite:
//let array = [2, 5, 6…]. Atspausdinkite  pirmą ir paskutinį masyvo elementą.
//Jeigu masyvo elementų reikšmės: 2, 5, 6, 8, 1, 9, tai pirma reikšmė – 2, paskutinė – 9.

public class MasyvaiUzd002 {
    public static void main(String[] args) {
        int n = 6;
        int[] array = new int[n];

        array[0] = 3;
        array[1] = 6;
        array[2] = 9;
        array[3] = 4;
        array[4] = 1;
        array[5] = 91;

        System.out.print(array[0] + " & " + array[5]);
    }

}
