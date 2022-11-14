package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner oku = new Scanner(System.in);
        int maxeleman=0;
        int i=1;
        while (i<6 ) {
            System.out.println("Bir sayı giriniz");
            int num=oku.nextInt();
            if (num>maxeleman) {
                maxeleman=num;
            } else maxeleman=maxeleman;
            i++;
        }

        System.out.println("Max eleman  "+ maxeleman);

    }
}
