package Baslangic;

import java.util.Scanner;

public class MaasHesaplama {
    static void main() {

        double zamOrani = 0.20;

        Scanner input= new Scanner(System.in);

        System.out.print("Maaşınızı Giriniz:");
        double maas= input.nextDouble();

        double zamMiktari= maas * zamOrani;
        double yeniMaas = maas + zamMiktari;

        System.out.print("Zam miktarı: ");
        System.out.printf("%.2f", zamMiktari);
        System.out.println();

        System.out.print("Yeni Maaş:" + yeniMaas + " " );

    }
}
