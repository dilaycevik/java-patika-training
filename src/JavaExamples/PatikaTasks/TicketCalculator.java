package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class TicketCalculator {
    static void main(String[] args) {

        String yon;
        int yas;
        double km, toplamFiyat;
        double mesafeBası = 0.10;


        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafe Bilgisi Giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşınız: ");
        yas = inp.nextInt();

        inp.nextLine();

        System.out.print("Tek/Çift Yön Bilgisi Giriniz: ");
        yon = inp.nextLine();

        toplamFiyat = (mesafeBası * km);
        System.out.println("Ödenecek Tutar :" + toplamFiyat + " TL");

        if (yas <= 0) {
            System.out.println("Yaş 0'dan Küçük Olamaz !");

        } else if (yas > 0 && yas <= 12) {
            toplamFiyat = toplamFiyat * 0.5;
            System.out.println("İndirimli Toplam Tutarınız:" + toplamFiyat + " TL");

        } else if (yas > 12 && yas <= 24) {
            toplamFiyat = toplamFiyat * 0.9;
            System.out.println("İndirimli Toplam Tutarınız:" + toplamFiyat + " TL");

        } else if (yas >= 65) {
            toplamFiyat = toplamFiyat * 0.8;
            System.out.println("İndirimli Toplam Tutarınız:" + toplamFiyat + " TL");

        }

        if (yon.equals("çift")) {
            toplamFiyat = toplamFiyat * 0.8;
            System.out.println("Son Fiyat:" + toplamFiyat + " TL");

        } else if (yon.equals("tek")) {
            System.out.println("Son Fiyat:" + toplamFiyat + " TL");

        } else {
            System.out.println("Hatalı Giriş Yaptınız !");
        }
    }
}
