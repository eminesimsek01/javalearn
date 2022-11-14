package j12_Loops.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("100' den küçük bir pozitif tamsayı girin ");
        int sayı = scan.nextInt();
        int i;
        if (sayı >= 100) {
            System.out.println("100'den küçük bir sayı girin lütfen ");
        } else
            for (i = sayı; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Javacan");
                } else if (i % 3 == 0) {
                    System.out.println(" Java");
                } else if (i % 5 == 0) {
                    System.out.println(" Can");
                }
                else System.out.println(i);
            }
    }
    }

