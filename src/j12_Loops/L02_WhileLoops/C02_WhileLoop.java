package j12_Loops.L02_WhileLoops;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //task->Girilen tamsayının rakamları toplamını print eden metod create ediniz:
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int num=scan.nextInt();
        System.out.println(rakamlarıtopla((int) num));
    }

    private static int rakamlarıtopla(int num) {
        int rakamtopla=0;
        while (num>0){//sayı 0'dan büyükse body aksiyon al
            int birler=num%10; //
            rakamtopla+=birler;//sayının birler basamağı rakamtoplamına eklendi
            num/=10;//sayı bir basamak eksiltildi
       }
        return rakamtopla;
    }
}
