package JavaExamples.DilayWorking;

public class ForWhileDeneme {
    static void main() {

      /*  int sayi;

        Scanner inp = new Scanner(System.in);

        for (boolean sonuc = true ; sonuc;){
            System.out.print("sayı giriniz: ");
            sayi = inp.nextInt();

            if (sayi < 0){
                sonuc = false;

       */

        /*int sayi;

        Scanner inp = new Scanner(System.in);

        System.out.print("sayı giriniz:");
        sayi = inp.nextInt();

        while (sayi > 0){
            System.out.print("sayı giriniz: ");
            sayi = inp.nextInt();

         */

        /*
        int i;

        for (i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println("i: " + i);


        }

         */

        int i = 0;

        while (i < 10){
            ++i;

            if (i == 5){
                continue;

            }
            System.out.println("i: " +i);



        }


    }
}
