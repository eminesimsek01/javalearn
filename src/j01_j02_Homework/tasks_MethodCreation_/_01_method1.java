package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int max = scan.nextInt();
        int range = max - 0;
        System.out.println(randomNum(max, range));
    }
    private static double randomNum(int max, int range) {
        int min=0;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }
    }


