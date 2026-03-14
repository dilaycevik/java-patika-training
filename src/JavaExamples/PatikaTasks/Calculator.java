package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class Calculator {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int n1 = input.nextInt();

        System.out.print("2. sayıyı girin: ");
        int n2 = input.nextInt();

        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");

        System.out.print("seçiminiz:");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("sonuç: " + (n1 + n2));
                break;

            case 2:
                System.out.println("sonuç: " + (n1 - n2));
                break;

            case 3:
                System.out.println("sonuç: " + (n1 * n2));
                break;

            case 4:
                System.out.println("sonuç: " + (n1 / n2));
                break;

            default:
                System.out.println("hatalı işlem");
                break;


        }

    }
}

