package Baslangic;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    static void main() {
        //int türünde değişkenleri oluşturduk
        int mat, fizik, kimya, biyoloji, turkce, ingilizce;

        //sınıfımızı tanmladık
        Scanner ders = new Scanner(System.in);

        //kullanıcıdan veri al
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = ders.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = ders.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = ders.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz: ");
        biyoloji = ders.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = ders.nextInt();

        System.out.print("İngilizce Notunuzu Giriniz: ");
        ingilizce = ders.nextInt();

        double toplam = (mat + fizik + biyoloji + kimya + ingilizce + turkce);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız: " + sonuc);
        boolean result = sonuc == 70.0;
        System.out.println(result);


    }
}
