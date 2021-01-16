package UzdaviniaiMasyvai;
//Exercise 20
//Kai kuriose sportinėse varžybose sportininko pasirodymą
//vertina keletas teisėjų. Iš gautų balų  atmetamas pats aukščiausias
//ir pats žemiausias įvertinimas ir tada randamas likusių balų vidurkis.
//Jei  aukščiausiu balu įvertino keli teisėjai, tai atmetamas tik vienas aukščiausias balas.
//Analogiškai  pasielgiama ir kai keli teisėjai įvertina žemiausiu balu.
//Į masyvą įvedami aštuonių teisėjų pateikti  sportininko pasirodymo įvertinimai balais.
//Parašykite programą sportininko pasirodymo galutiniam  įvertinimui rasti.

import java.util.Arrays;
public class MasyvaiUzd020 {
    public static void main(String[] args) {

        int n =8;
        int[] evalue = new int[n];

        for (int i = 0; i < n; i++) {
            evalue[i] = getRandom(0,10);
        }

        System.out.println(Arrays.toString(evalue));

        int max=0;
        int min=10;
        int countMax=0;
        int countMin=0;


        for(int i=0; i<evalue.length;i++){
            if (evalue[i]>=max) {
                max=evalue[i];
                countMax=i;
            }
            else if (evalue[i]<=min) {
                min=evalue[i];
                countMin=i;
            }
        }

        double sum=0;
        int[] forSum = new int[evalue.length-2];

        for (int i=0; i< forSum.length;i++) {
            for (int j=0; j<evalue.length;j++) {
                if ((j!=countMin)&&(j!=countMax)) {
                    forSum[i]=evalue[j];
                    i++;
                }
            }
        }

        System.out.println(Arrays.toString(forSum));

        for (int i=0; i< forSum.length; i++) {
            sum=sum+forSum[i];
        }

        double avrg=sum/ forSum.length;

        System.out.printf("Galutinis įvertinimas: %.2f", avrg);


    }

    private static int getRandom(int a, int b) {
        return (a + (int) (Math.random() * ((b - a) + 1)));
    }
}
