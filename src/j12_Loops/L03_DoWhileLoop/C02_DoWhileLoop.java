package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //Girilen sayı 17'den küçük ise kazandınız, büyük ise kaybettiniz yazısı create eden do while loop döngüsü
        //oluşturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int num=scan.nextInt();
        do {
            System.out.println(num+" . kazandınız ");
            num++;
        }while (num<17);
        System.out.println("kaybettiniz........:(");
    }
}
