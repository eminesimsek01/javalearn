package j11_MethodCreation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

     //Girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz.
     Scanner sc=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz :");
        double sayı1=sc.nextDouble();

        System.out.println("2. Sayıyı giriniz :");
        double sayı2=sc.nextDouble();

        System.out.println("bir işlem seçiniz : ");
        char islem=sc.next().charAt(0);
        islemMenu(islem, (int) sayı1, (int) sayı2); //method çağırdı. Method calls


    }//main sonu

    public static void islemMenu(char ch, int x, int y) {
        switch(ch) {
            case '+':
                topla (x, y);
                break;
            case '-':
                çıkar (x, y);
                break;
            case '*':
                çarp (x, y);
                break;
            case '/':
                böl (x, y);
                break;
        }
    }
    public static void topla(int a, int b) {
        System.out.println("a+b="+(a+b));
    }
    public static void çıkar(int a, int b) {
        System.out.println("a-b="+(a-b));
    }
    public static void çarp(int a, int b) {
        System.out.println("a*b="+(a*b));
    }
    public static void böl(int a, int b) {
        System.out.println("a/b="+(a/b));
    }
}
