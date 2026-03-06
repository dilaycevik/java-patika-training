package Baslangic;

import java.util.Scanner;

public class VeriAlma {
    static void main() {
       Double a;
        Scanner veri = new Scanner(System.in);
        System.out.println("Bir Değer Giriniz");
        a = veri.nextDouble();
        System.out.println(a);
        String str = veri.nextLine();
        System.out.println(str);

    }

}
