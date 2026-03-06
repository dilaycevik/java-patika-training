package Baslangic;

import java.util.Scanner;

public class kmHesaplama {
    static void main() {

        int km, startPrice = 10;
        double perKm = 2.20;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe Giriniz:");
        km = input.nextInt();

        toplam = (km * perKm);
        toplam += startPrice;


        toplam = (toplam < 20) ? 20 : toplam;
        System.out.print("ödenecek tutar: " + toplam);


    }
}
