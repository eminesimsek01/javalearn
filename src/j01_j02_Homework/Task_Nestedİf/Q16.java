import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Lütfen üç adet numara giriniz ");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        if (a>b&&a>c) {
            if (b>c){
                System.out.println(" Max sayı: "+a+" Min sayı : "+c);
            } else System.out.println(" Max sayı:"+a+" Min sayı : "+b);
        }
        else if (b>a&&b>c){
            if (b>a){
                System.out.println(" Max sayı: "+b+" Min sayı : "+c);
            } else System.out.println(" Max sayı:"+b+" Min sayı : "+a);
        }
        else if (c>b&&c>a){
            if (b>a){
                System.out.println(" Max sayı: "+c+" Min sayı : "+a);
            } else System.out.println(" Max sayı:"+c+" Min sayı : "+b);
        }
    }
}

