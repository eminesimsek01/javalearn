package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first midterm grade :");
        int midtermF=scan.nextInt();
        System.out.println("Please enter your second midterm grade :");
        int midtermS=scan.nextInt();
        int midtermA=(midtermF+midtermS)/2;
        System.out.println("Please enter your second final grade :");
        int finalG=scan.nextInt();
        double lastG=(midtermA*0.3+midtermS*0.7);
        System.out.println("You can see your grade on the screen = " + lastG);

    }
}
