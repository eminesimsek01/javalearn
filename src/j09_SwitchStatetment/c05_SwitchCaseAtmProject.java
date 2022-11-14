package j09_SwitchStatetment;

import java.util.Scanner;

public class c05_SwitchCaseAtmProject {
    public static void main(String[] args) {
        //TASK-> Bakiye(başlangıç parası 1000tl) öğrenme, para yatırma, çekme ve çıkış işlemlerinin
        //yapıldığı bir atm app. code create ediniz.
        System.out.println("ATM'ye hoş geldiniz ");
        int bakiye = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bakiye öğrenme 1'e basın \nPara yatırma için 2'ye basın \nPara çekmek için 3'e basın \nÇıkmak için" +
                          " 4'e basın :");
        int sayi = sc.nextInt();
        int bakıye=1000;
        switch (sayi) {
            case 1:
                System.out.println("Bakiyeniz  :"+bakıye);
                break;
            case 2:
                System.out.println("Ne kadar para yatırmak istiyorsun kardeş?");
                int yatırılanm=sc.nextInt();
                System.out.println("Güncel bakiyeniz : "+(yatırılanm+bakiye));
                break;
            case 3:
                System.out.println("Ne kadar para çekmek istiyorsun kardeş?");
                int cekılenm=sc.nextInt();
                if (cekılenm>bakiye) {
                    System.out.println("Hesabınızda yeterli mikatrda para bulunmamaktadır. ");
                }
                else  bakiye-=cekılenm;
                    System.out.println();
                System.out.println("Güncel bakiyeniz :"+bakiye);
                break;
            case 4:
                System.out.println("agam çıkışın yapıldı selametle ");
            break;
            default:
                System.out.println("Yanlış işlem seçtiniz ");

        }
    }
}
