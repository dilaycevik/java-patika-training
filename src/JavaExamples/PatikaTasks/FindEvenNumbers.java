package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class FindEvenNumbers {
    static void main() {

       /* int k;

        Scanner inp = new Scanner(System.in);

        System.out.print("sayı giriniz: ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0){
                System.out.println(i);

            }


        }

        */

        int k, i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("sayı giriniz: ");
        k = inp.nextInt();

        while (i <= k){
            i++;

            if (i % 2 ==0){
                System.out.println(i);

            }
        }



    }
}
