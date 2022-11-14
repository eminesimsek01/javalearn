package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Give your sleep hours for a day : ");
        int sleepH=scan.nextInt();
        int sleepMonth=(30*sleepH);
        int sleepYear=(sleepMonth*12);
        int sleepFourtyY=(sleepYear*40);
        System.out.println("Your sleep hours for a month :"+sleepMonth+" Your sleep hours for a year :"+sleepYear+" Your sleep hours for 40 years"+sleepFourtyY);
    }
}
