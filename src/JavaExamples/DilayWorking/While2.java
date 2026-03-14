package JavaExamples.DilayWorking;

import java.util.Scanner;

public class While2 {
    static void main() {

        int password;
        boolean isPasswordSuccess = true;

        Scanner inp = new Scanner(System.in);


        while (isPasswordSuccess) {
            System.out.print("Şifrenizi Giriniz: ");
            password = inp.nextInt();

            if (password == 123) {
                System.out.println("Giriş Başarılı !");

                isPasswordSuccess = false;

            } else {
                System.out.println("Şifre Yanlış !");
                }
            }
        }
    }
