package j01_j02_Homework.Task2;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */



        Scanner scan=new Scanner(System.in);
        System.out.println("Banka Hesabınız Var Mı? ");
        Boolean hesap=scan.nextBoolean();
        System.out.println("hesap = " + hesap);
    }
}
