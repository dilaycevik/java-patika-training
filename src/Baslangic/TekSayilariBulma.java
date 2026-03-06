package Baslangic;

import java.util.Scanner;

public class TekSayilariBulma {
    static void main() {

        int n, total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("sayı giriniz: ");
            n = inp.nextInt();
            if (n % 4 == 0) {
                total += n;

            }
        }
        while (n > 0);
        System.out.println("toplam: " + total);
    }
}
