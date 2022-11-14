package j01_CodeChallenge.YirmiDörtEkim;

import java.util.Scanner;

public class Q3_Question {
    public static void main(String[] args) {

        /*
        Ask user to enter a number and print on console number by number matrix.

        Example:
        Input: 10

        Output:
        1 0 0 1 1 0 0 0 1 1
        0 0 1 0 1 0 1 0 0 0
        0 1 0 1 0 0 0 0 0 1
        1 1 1 0 0 0 0 1 1 1
        1 1 0 1 1 1 0 1 0 0
        1 0 0 0 1 1 0 0 0 0
        0 0 1 0 0 0 0 1 1 1
        1 1 0 1 0 1 0 0 1 0
        0 0 1 0 0 0 0 1 1 0
        1 1 1 0 0 1 1 1 1 0

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Matrisin boyutunu giriniz :");
        int sayı=scan.nextInt();
        for(int i=0; i<sayı; i++){
            for(int j=0; j<sayı; j++){
                System.out.print((int) (Math.random()*2)+" ");
            }
            System.out.println();
        }
    }
}
