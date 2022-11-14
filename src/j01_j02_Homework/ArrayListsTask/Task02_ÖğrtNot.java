package j01_j02_Homework.ArrayListsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane not girmek isterseniz: ");
        int notSayısı = scan.nextInt();
        ArrayList<Integer> notlar = new ArrayList<>();
        int önotu = 0;
        for (int i = 0; i < notSayısı; i++) {
            System.out.println("Bir not giriniz");
            önotu =scan.nextInt();
            notlar.add(önotu);
        }
        System.out.println("Notlarınız :" + notlar);
        ortalama(notlar, notSayısı, önotu);

    }//main sonu

    private static void ortalama(ArrayList<Integer> notlar, int notSayısı, int önotu) {
        toplam(notlar);
        int count=0;
        int ortalama=toplam(notlar)/notSayısı;
        if (önotu>ortalama){
            count++;
        }
        System.out.println("Ortalamayı geçen öğrenci sayısı "+count);
    }

    private static int toplam(ArrayList<Integer> notlar) {
        int toplam=0;
        for (int j=0; j<notlar.size(); j++){
            toplam+=notlar.get(j);
        }

        return toplam;
    }


}

