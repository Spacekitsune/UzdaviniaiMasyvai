package UzdaviniaiMasyvai;//Exercise 9
//Sukurkite funkciją (metodą) random(a, b),
//kuri gauna dvi reikšmes: intervalo pradžią a ir pabaigą b 
//ir grąžina sugeneruotą (random) skaičių iš duoto intervalo.
//Sukurkite masyvą a[n], kur n yra įvedamas iš klaviatūros. 
//Taip pat įveskite dvi reikšmes: intervalo pradžią ir pabaigą.
//Atspausdinkite masyvo sugeneruotas reikšmes.


import java.util.Scanner;
public class MasyvaiUzd009 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Iveskite skaičių: ");
        int n = reader.nextInt();
        int[] masyvas = new int[n];

        System.out.print("Iveskite masyvo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite masyvo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                masyvas[i] = a;
            } else if (i == n - 1) {
                masyvas[i] = b;
            } else {
                masyvas[i] = getRandom(a, b);
            }
        }

        System.out.print("Masyvas užpildytas atsitiktinėmis reikšmėmis: ");
        for (int l = 0; l < n; l++) {
            System.out.print(masyvas[l] + " ");
        }
        reader.close();
    }

    private static int getRandom(int a, int b) {
        if (b > a) {
            return (a + (int) (Math.random() * ((b - a) + 1)));
        } else {
            return (b + (int) (Math.random() * ((a - b) + 1)));
        }
    }
}


