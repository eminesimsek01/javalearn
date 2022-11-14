package j12_Loops.Tasks;

import java.util.Scanner;

public class NestedLoopTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi=scan.nextInt();
        for (int i = 0; i <sayi;i++){
            for (int j = 0; j < sayi; j++) {
                if(i==j)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
