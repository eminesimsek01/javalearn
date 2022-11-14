package j12_Loops.L02_WhileLoops;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //Girilen tam sayının tam bölen sayısının print eden kod create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num=scan.nextInt();
        int bölennum=1;
        int tambölenadedi=1;
        System.out.println(tamsayıbölen((int) num, (int) bölennum, (int) tambölenadedi));

    }

    private static int tamsayıbölen(int num, int bölennum, int tambölenadedi) {
        while (bölennum<num) {
            if (num % bölennum == 0) {
                tambölenadedi++;
            } bölennum++;
        }

        return tambölenadedi;
    }


}
