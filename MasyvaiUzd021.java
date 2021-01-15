package UzdaviniaiMasyvai;
//Exercise 21
//Duotas studentų skaičius n (n=30)
//ir jų egzamino pažymiai, kurie surašyti į masyvą pazymiai[n].
//Apskaičiuokite kiek studentų neišlaikė egzamino ir koks yra pažangių studentų pažymių vidurkis.
//Jei  studentas už egzaminą gavo pažymį 4 ar didesnį – jis pažangus.

import java.util.Arrays;
public class MasyvaiUzd021 {
    public static void main(String[] args) {

        int n = 30;
        int[] pazymis = new int[n];

        for (int i=0; i< pazymis.length;i++) {
            pazymis[i]=getRandom(1,10);
        }

        System.out.println(Arrays.toString(pazymis));

        int countPazangus=0;
        int countFail=0;

        for (int i=0; i<pazymis.length ;i++){
            if (pazymis[i]>3) {
                countPazangus++;
            } else {
                countFail++;
            }
        }

        System.out.printf("%d mokinių yra pažangūs, %d neišlaikė egzamino.", countPazangus, countFail);

    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
