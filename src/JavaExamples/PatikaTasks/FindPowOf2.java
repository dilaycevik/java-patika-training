package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class FindPowOf2 {
    static void main() {

        int n;

        Scanner inp = new Scanner(System.in);

        System.out.print("sayı giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);

        }
    }
}
