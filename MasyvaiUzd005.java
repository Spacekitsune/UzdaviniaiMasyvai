//Exercise 5
//Sukurkite sveikųjų skaičių masyvą pavadinimu array,
//kuris gali išsaugoti 15 reikšmių, t.y. n  = 15. Reikšmes masyvui
//suteikite iš karto – inicijuokite: array = [1, 2, 3…]. Prie kiekvienos
//masyvo elemento reikšmės pridėkite dydį x. Dydis x yra įvedamas vartotojo.
//Jeigu dydis x = 5 ir masyvo elementų reikšmės: 1, 2, 3, ..., 1,
//tai programa atspausdina:  6, 7, 8, ..., 6.

public class MasyvaiUzd005 {
    public static void main(String[] args) {


        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int x=5;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + x + " ");
        }

    }
}
