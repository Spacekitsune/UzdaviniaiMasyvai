package UzdaviniaiMasyvai;
//Exercise 15
//Duotas n=200 prekių kainų masyvas prekes[n].
//Prekės, kurių kaina mažesnė už kainų vidurkį,
//pabranginamos p procentų.
//Parašykite programą vidutinei prekių kainai po pabrangimo apskaičiuoti.
import java.text.DecimalFormat;
import java.util.Scanner;

public class MasyvaiUzd015 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n = 200;
        double[] prekes = new double[n];

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        double a = reader.nextDouble();
        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        double b = reader.nextDouble();

        double sum=0;

        for (int i = 0; i < n; i++) {
            prekes[i] = getRandom(a, b);
            sum=sum+prekes[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print( df2.format(prekes[i]) + " ");
        }

        double avg=sum/n;
        System.out.println(" ");
        System.out.println("vidutinė kaina: " + avg);

        System.out.print("Iveskite % skaičių: ");
        double p = reader.nextDouble();

        for (int i = 0; i < n; i++) {
           if (prekes[i]<p) {
               prekes[i]=prekes[i] + (prekes[i] / 100) * p;
           }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(df2.format(prekes[i]) + " ");
        }

        reader.close();
    }

    private static double getRandom(double a, double b) {
        return (a + (Math.random() * ((b - a) + 1)));

    }

    private static DecimalFormat df2 = new DecimalFormat("#.##");
}
