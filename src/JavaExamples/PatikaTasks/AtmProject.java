package JavaExamples.PatikaTasks;

import java.util.Scanner;

public class AtmProject {
    static void main() {

        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0 && right <= 3) {
            System.out.print("kullanıcı adınız: ");
            userName = inp.nextLine();
            System.out.print("şifreniz: ");
            password = inp.nextLine();

            if (userName.equals("dilay") && password.equals("3669")) {
                System.out.println("Kodluyoruz Bankasına Hoş Geldiniz Lütfen Yapacağınız İşlemi Seçin !");

                do {
                    System.out.println("1- Para Yatırma\n" + "2- Para Çekme\n" + "3- Bakiye Sorgulama\n" + "4- Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select = inp.nextInt();

                    if (select == 1) {
                        System.out.print("Yatırmak İstediğiniz Tutar: ");
                        int price = inp.nextInt();
                        balance += price;

                    } else if (select == 2) {
                        System.out.print("Çekmek İstediğiniz Tutar: ");
                        int price = inp.nextInt();
                        if (balance < price) {
                            System.out.println("Yetersiz Bakiye !");
                        } else {
                            balance -= price;
                        }

                    } else if (select == 3) {
                        System.out.println("Toplam Bakiyeniz: " + balance + "TL");
                    }
                } while (select != 4);
                System.out.println("Bizi Tercik Ettiğiniz İçin Teşekkür Ederiz !");
                break;

            } else {
                right--;
                System.out.println("Hatalı Kullacı Adı veya Şifre Girdiniz !");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur !");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }

            }

        }


    }
}
