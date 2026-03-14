package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class Exponents {
    static void main() {

        int n, k;

        Scanner inp = new Scanner(System.in);

        System.out.print("sayı giriniz: ");
        n = inp.nextInt();

        System.out.print("üs değeri giriniz: ");
        k = inp.nextInt();

        int total = 1;

        for (int i = 1; i <= k; i++){
            total *= n;

        }
        System.out.println("sonuç: " + total);

    }
}
