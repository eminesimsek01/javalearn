package j13_BreakContinue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {

        /*
        Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
        atlar ve loop'un bir sonraki değerinden devam eder.

         */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Agam meyil hesabını mı istersen :");
        String meyil=scan.nextLine();//egik Gabık @ cimey ıl. k on
        for(int i=0; i<meyil.length(); i++){
            char ch=meyil.charAt(i);
            if (ch== ' '){
                continue;
            }
            System.out.println(ch);
        }


    }
}
