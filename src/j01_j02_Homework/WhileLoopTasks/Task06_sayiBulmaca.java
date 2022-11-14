package j01_j02_Homework.WhileLoopTasks;

import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Scanner scan=new Scanner(System.in);
        int randomnum= (int) (Math.random()*(100)+1);
        System.out.println("Sayıyı tahmin etmeye çalışınız : ");
        int tahmin=scan.nextInt( );
        while (tahmin!=randomnum){
            if (tahmin>randomnum){
                System.out.println("Sayıyı küçült");
                System.out.println("Sayıyı tahmin etmeye çalışınız : ");
                tahmin=scan.nextInt( );
            }
            else if (tahmin<randomnum){
                System.out.println("Sayıyı büyült");
                System.out.println("Sayıyı tahmin etmeye çalışınız : ");
                tahmin=scan.nextInt( );
            }
        }
        System.out.println("Doğru, congratulations! ");


    }

}
