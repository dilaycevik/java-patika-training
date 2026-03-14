package JavaExamples.DilayWorking;

import java.util.Scanner;

public class Noh2 {
    static void main() {
        int matematik, fizik, kimya, biyoloji, ingilizce, turkce;
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik= input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik= input.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz: ");
        biyoloji= input.nextInt();

        System.out.print("İngilizce Notunuzu Giriniz: ");
        ingilizce= input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce= input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya= input.nextInt();

        double result= (matematik + fizik + kimya + biyoloji + ingilizce + turkce) / 6;
        System.out.println("Not Ortlamanız: " + result);
        boolean sonuc = result == 60;
        System.out.println(sonuc);





















    }
}
