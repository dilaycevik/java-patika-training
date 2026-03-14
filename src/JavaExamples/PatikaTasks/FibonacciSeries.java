package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class FibonacciSeries {
    static void main() {

        Scanner inp = new Scanner(System.in);

        int n, a = 0, b = 1;

        System.out.print("eleman sayısını girin: ");
        n = inp.nextInt();

        for (int i = 0; i <= n; i++) {

            int c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }
    }
}
