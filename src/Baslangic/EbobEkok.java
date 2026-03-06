package Baslangic;

import java.util.Scanner;

public class EbobEkok {
    static void main() {

        int n1, n2, i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("1.sayı: ");
        n1 = inp.nextInt();
        System.out.print("2.sayı: ");
        n2 = inp.nextInt();

        int ebob = 1;

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (n1*n2) / ebob;

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);










        /*while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }

        System.out.println((n1 * n2) / ebob);

         */
    }
}
