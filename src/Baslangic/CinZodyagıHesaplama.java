package Baslangic;

import java.util.Scanner;

public class CinZodyagıHesaplama {
    static void main(String[] args) {

        int DogumTarihi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Tarihiniz: ");
        DogumTarihi = inp.nextInt();

        int sonuc = (DogumTarihi % 12);

        System.out.print("Çin Zodyağı: ");

        if (sonuc == 0){
            System.out.print("Maymun !");

        }else if (sonuc == 1){
            System.out.print("Horoz !");

        }else if (sonuc == 2){
            System.out.print("Köpek !");

        }else if (sonuc == 3){
            System.out.print("Domuz !");

        }else if (sonuc == 4){
            System.out.print("Fare !");

        }else if (sonuc == 5){
            System.out.print("Öküz !");

        }else if (sonuc == 6){
            System.out.print("Kaplan !");

        }else if (sonuc == 7){
            System.out.print("Tavşan !");

        }else if (sonuc == 8){
            System.out.print("Ejderha !");

        }else if (sonuc == 9){
            System.out.print("Yılan !");

        }else if (sonuc == 10){
            System.out.print("At !");

        }else if (sonuc == 11){
            System.out.print("Koyun !");
        }else {
            System.out.println("Hatalı Giriş !");
        }




    }
}
