package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime veya karakter giriniz: ");
        String x=scan.nextLine();
        while (!x.equalsIgnoreCase("x")) {
            System.out.println("jAVACAN");
            System.out.println("Bir kelime veya karakter giriniz :");
            x=scan.nextLine();
        }
        System.out.println("jAVATAR");


    }
}
