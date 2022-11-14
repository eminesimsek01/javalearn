package j08_ifStatement;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //Task-> Kullanıcın cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000'den fazla ise,
        //kullanıcının cinsiyeti ERKEK ise 65 yaşından büyük ve  prim günü 7000'den fazla ise emekliliğini kontrol edip
        //kslan yıl ve prim gününü print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Cinsiyeti kadın için k,\n Erkek için e giriniz : ");
        char cinsiyet= scan.nextLine().charAt(0);

        if (cinsiyet=='k')
        {   System.out.println("Yaşınızı giriniz ");
            int yas=scan.nextInt();
            if (yas>60)
            {
                System.out.println("prim günü girin");
                int prim= scan.nextInt();
                if (prim>6000) System.out.println("emeklisiniz");
                else
                System.out.println("emekliliğinize"+(6000-prim)+" prim günü kaldı ");
            }
                else
                    System.out.println("emekliliğinize"+(60-yas)+" yıl kaldı ");
        }
                else if (cinsiyet=='e')
                {
                    System.out.println("Yaşınızı giriniz ");
                    int yas=scan.nextInt();
                    if (yas>65)
                    {
                        System.out.println("prim günü girin");
                        int prim= scan.nextInt();
                        if (prim>7000){
                        System.out.println("emeklisiniz");
                        }
                        else
                        System.out.println("emekliliğinize"+(7000-prim)+" prim günü kaldı ");
                    }
        else System.out.println("emekliliğinize"+(65-yas)+" yıl kaldı ");
        }

                else System.out.println(" cinsiyet için e veya k dışında başka bir karakter giremezsiniz");


    }
}
