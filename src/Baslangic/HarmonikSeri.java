package Baslangic;

import java.util.Scanner;

public class HarmonikSeri {
    static void main() {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        n = inp.nextInt();

        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += 1/i;

        }
        System.out.print("sonuç: " + result);

    }
}
