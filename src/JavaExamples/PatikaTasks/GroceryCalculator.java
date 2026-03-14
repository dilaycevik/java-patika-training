package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class GroceryCalculator {
    static void main() {

        double domates = 3 , patlıcan = 5, muz = 20 , elma= 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Domates Miktarını Kg Cinsinden Yazınız: ");
       double domatesKg = input.nextDouble();

        System.out.print("Patlıcan Miktarını Kg Cinsinden Yazınız: ");
        double patlıcanKg = input.nextDouble();

        System.out.print("Muz Miktarını Kg Cinsinden Yazınız: ");
        double muzKg = input.nextDouble();

        System.out.print("Elma Miktarını Kg Cinsinden Yazınız: ");
        double elmaKg = input.nextDouble();

        double total= (domatesKg * domates) + (patlıcanKg * patlıcan) + (muzKg * muz) + (elmaKg * elma);

        System.out.print("Toplam Ödenecek Tutar: " + total);












    }
}
