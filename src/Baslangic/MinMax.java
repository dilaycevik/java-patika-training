package Baslangic;

import java.util.Scanner;

public class MinMax {
    static void main() {

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = inp.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        int sayi = inp.nextInt();

        int min = sayi;
        int max = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = inp.nextInt();

            if (sayi < min) {
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
