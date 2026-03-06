package Baslangic;

import java.util.Scanner;

public class DoWhile {
    static void main() {

        int password;
        boolean askPassword = true;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("şifrenizi giriniz: ");
            password = inp.nextInt();

            if (password == 157) {
                System.out.print("giriş başarılı !");
                askPassword = false;

            }else{
                System.out.println("giriş başarısız !");
            }

        } while (askPassword);




    }
}
