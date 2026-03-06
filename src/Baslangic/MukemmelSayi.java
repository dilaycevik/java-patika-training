package Baslangic;

import java.util.Scanner;

public class MukemmelSayi {
    static void main() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int n = inp.nextInt();

        int toplam = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.println(n + " mükemmel sayıdır!");
        } else System.out.println(n + " mükemmel sayı değildir!");
    }
}
