package Baslangic;

import java.util.Scanner;

public class KullaniciGirisi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;

        System.out.print("kullanıcı adı: ");
        username = input.nextLine();

        System.out.print("şifreniz: ");
        password = input.nextLine();

        if (username.equals("dilay") && password.equals("123")) {
            System.out.println("giriş başarılı");
        } else {
            System.out.println("hatalı giriş yaptınız");
        }
        if (password != "123") {
            System.out.println("hatalı şifre girdiniz şifrenizi sıfırlamak ister misiniz?");
            System.out.println("yeni gireceğiniz şifre eski şifreniz ile aynı olmamalıdır.");
        }
    }
}
