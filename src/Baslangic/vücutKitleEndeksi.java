package Baslangic;

import java.util.Scanner;

public class vücutKitleEndeksi {
    static void main() {

        double boy;
        double kilo;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        double vki = kilo / (boy * boy) ;

        System.out.print("Vücut Kitle İndeksiniz: " + vki);
    }
}
