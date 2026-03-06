package Baslangic;

import java.util.Scanner;

public class hipo {
    static void main() {

        int a , b ;
        double c ;

        Scanner input= new Scanner(System.in);

        System.out.print("1.Kenar: ");
        a= input.nextInt();

        System.out.print("2.kenar: ");
        b= input.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.print("hipotenüs: "+c);

    }
}
