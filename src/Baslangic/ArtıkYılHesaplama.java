package Baslangic;

import java.util.Scanner;

public class ArtıkYılHesaplama {
    static void main(String[] args) {

        int yil;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yil = inp.nextInt();

        if ((yil % 4 == 0) && (yil % 100 != 0) || (yil % 400 == 0)){
            System.out.print("Artık Yıl ! ");

        }else {
            System.out.print("Artık Yıl Değil !");
        }


    }
}
