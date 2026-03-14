package JavaExamples.DilayWorking;

public class Baslangic {
    static void main() {
        int a = 10 , b = 5 , c = 10 ;

        boolean kosul1 = (a == b);
        System.out.println(kosul1);

        boolean kosul2 = a!=c ;
        System.out.println(kosul2);

        boolean kosul3 = kosul1 && kosul2 ;
        System.out.println(kosul3);

        boolean kosul4 = kosul2 || kosul3;
        System.out.println(kosul4);

        boolean sonuc = !kosul2;
        System.out.println(sonuc);

        a = (a == c) ? 5 : 10;
        System.out.println(a);
         b = ( a<b) ? 5 : 10;
         System.out.println(b);


    }

}

