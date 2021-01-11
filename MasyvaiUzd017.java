package UzdaviniaiMasyvai;
//Exercise 17
//Parašykite programą, kuri įterptų į masyvą arrQ[n] (n=50)
//prieš k-tąjį elementą reikšmę X, surašant  reikiamus elementus
//į naują masyvą arrY[n+1]. Atspausdinkite masyvą arrY[n+1].
import java.util.Scanner;
public class MasyvaiUzd017 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 50;
        int[] arrQ = new int[n];
        int[] arrY = new int[n+1];
        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < n; i++) {
            arrQ[i] = getRandom(a, b);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrQ[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Iveskite k skaičių: ");
        int k = reader.nextInt();
        k=k-1; //todėl, kad taip lengviau patikrinti

        System.out.print("Iveskite skaičių, kurį norite įterpti: ");
        int x = reader.nextInt();

        for (int i = 0; i < n+1; i++) {
            if (i<k) {
                arrY[i]=arrQ[i];
            } else if (i==k) {
                arrY[i] = x;
            } else if (i>k) {
                arrY[i] =arrQ[i-1];
            }
        }

        System.out.println(" ");
        for (int i = 0; i < n+1; i++) {
            System.out.print(arrY[i] + " ");
        }
        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
