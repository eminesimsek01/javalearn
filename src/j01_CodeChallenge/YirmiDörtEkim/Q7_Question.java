package j01_CodeChallenge.YirmiDörtEkim;

import java.util.Scanner;

public class Q7_Question {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı girsene ");
        int num1=scan.nextInt();
        System.out.println("Bir sayı girsene ");
        int num2=scan.nextInt();
        System.out.println(Math.max(num2, num1));
        if (num1>num2){
           int random= (int) (Math.random()*num1);
            System.out.println("random"+ random);
        } else {
            int random= (int) (Math.random()*num2);
            System.out.println("random "+random);
        }

    }


}
