package j12_Loops.Tasks;

import java.util.Scanner;

public class NestedLoopTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi;i++){
            for (int j = 1; j <= sayi; j++) {

                    System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
