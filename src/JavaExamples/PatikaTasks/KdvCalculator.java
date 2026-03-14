package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class KdvCalculator {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün fiyatını Giriniz: ");
        double fiyat = input.nextDouble();

        double kdv = 0.18;
        double toplam = fiyat * kdv ;
        double sonuc = kdv + toplam ;

        System.out.println("kdv tutarı: 18" + kdv);
        System.out.println("Kdv Dahil Fiyatı: " + sonuc);
    }
}
