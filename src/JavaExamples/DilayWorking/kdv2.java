package JavaExamples.DilayWorking;

import java.util.Scanner;

public class kdv2 {
    static void main() {

        double tutar, kdvOrani= 0.20 , kdvTutari, toplamTutar;
        Scanner input= new Scanner(System.in);

        System.out.print("Tutar Giriniz: ");
        tutar= input.nextDouble();

        kdvTutari= tutar * kdvOrani;
        toplamTutar= kdvTutari + tutar;

        System.out.println("kdv Tutarı:" + kdvTutari);
        System.out.println("toplam tutarınız:" + toplamTutar);


    }
}
