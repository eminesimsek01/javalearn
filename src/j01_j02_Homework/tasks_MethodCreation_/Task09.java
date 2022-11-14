package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Saniyeye dönüştürmek istediğiniz saat değerini girin :");
        int saat=scan.nextInt();
        System.out.println(saniyeyedonusturme((int) saat));
    }

    private static int saniyeyedonusturme(int saat) {
        int saniye=saat*3600;
        System.out.println("Girdiğiniz saatin saniye cinsinden karşılığı :" +saniye);
        return saniye;
    }
    }

