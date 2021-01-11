//Exercise 3
//Sukurkite sveikųjų skaičių masyvą pavadinimu array,
//kuris gali išsaugoti 3 reikšmes, t.y. n  = 3.
//Reikšmes masyvui suteikite iš karto – inicijuokite: array = [99, 55, 77].
//Atspausdinkite  masyvo elementų reikšmes ir jų vietą masyve.
//Jeigu masyvo elementų reikšmės: 99, 55, 77, tai 99 – 0 vieta, 55 – 1 vieta, 77 – 2 vieta.

public class MasyvaiUzd003 {
    public static void main(String[] args) {

        int[] array = new int[3];

        array[0] = 99;
        array[1] = 55;
        array[2] = 77;

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " vieta - " +array[i] + ", ");
        }
    }
}
