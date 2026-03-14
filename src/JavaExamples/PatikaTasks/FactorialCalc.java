package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class FactorialCalc {
    static void main() {

        int n, total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("faktöriyel sayısı: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {

            total = total * i;

        }
        System.out.println(total);


    }
}
