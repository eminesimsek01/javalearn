package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir yıl girin artık yıl mı, değil mi söyleyelim?");
        int yıl=scan.nextInt();
        artyılchecking(yıl);

    }

    private static <yıl> void artyılchecking(int yıl) {
        System.out.println( (yıl%4==0?(yıl%100==0?(yıl%400==0?"Girdiğiniz yıl artık":"Girdiğiniz yıl artık yıl değil"):"Girdiğiniz yılın " +
                "100 ile bölümünden kalan 0 değil"): "Girdiğiniz yıl 4'ün katı değil"));
    }
}
