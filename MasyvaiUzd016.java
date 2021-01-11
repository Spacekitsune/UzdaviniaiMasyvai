package UzdaviniaiMasyvai;
//Exercise 16
//Parašykite programą, kuri pašalintų masyvo arrG[n] (n=20) k-tąjį elementą,
//surašant reikiamus  elementus į naują masyvą arrH[n-1]. Atspausdinkite masyvą arrH[n-1].
import java.util.Scanner;
public class MasyvaiUzd016 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 20;
        int[] arrG = new int[n];
        int[] arrH = new int[n-1];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int b = reader.nextInt();

        for (int i = 0; i < n; i++) {
            arrG[i] = getRandom(a, b);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrG[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Iveskite k skaičių: ");
        int k = reader.nextInt();
        k=k-1; //todėl, kad taip lengviau patikrinti

        for (int i = 0; i < n-1; i++) {
            if (i<k) {
                arrH[i]=arrG[i];
            } else if (i>=k) {
                arrH[i] = arrG[i+1];
            }
        }

        System.out.println(" ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arrH[i] + " ");
        }
        reader.close();
    }
    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));

    }
}
