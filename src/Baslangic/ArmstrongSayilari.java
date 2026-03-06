package Baslangic;

import java.util.Scanner;

public class ArmstrongSayilari {
    static void main() {

        int sayi, toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        sayi = inp.nextInt();

        while (sayi != 0){

            int sonBasamak = sayi % 10;

            toplam += sonBasamak;

            sayi = sayi / 10;

        }
        System.out.println("basamakların toplamı: " + toplam);
    }
}
