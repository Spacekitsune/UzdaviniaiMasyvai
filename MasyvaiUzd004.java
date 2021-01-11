//Sukurkite sveikųjų skaičių masyvą pavadinimu array,
//kuris gali išsaugoti 10 reikšmių, t.y. n  = 10.
//Reikšmes masyvui suteikite iš karto – inicijuokite: array = [2, 5, 6…].
//Masyvo  elementus atspausdinkite naudodami ciklą for.

public class MasyvaiUzd004 {
    public static void main(String[] args) {


        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
