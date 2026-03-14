package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class FindHipotenus {
    static void main() {

        int a, b;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenar: ");
        a = input.nextInt();

        System.out.print("2.Kenar:");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenüs:" + c);


    }
}
