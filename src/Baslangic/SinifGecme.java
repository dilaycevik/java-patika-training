package Baslangic;

import java.util.Scanner;

public class SinifGecme {
    static void main(String[]args) {

        int matematik, turkce, fizik, kimya, ingilizce;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuz: ");
        matematik = input.nextInt();

        System.out.print("türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("ingilizce notunuz: ");
        ingilizce = input.nextInt();

        double avarage = (matematik+turkce+fizik+kimya+ingilizce) / 5;

        if (avarage >= 55){
            System.out.println("tebrikler sınıfı geçtiniz !");
        } else {
            System.out.println("sınıfı geçemediniz :(");

        }
        System.out.println("ortalamanız: " +avarage);



    }
}
