package j01_j02_Homework.Arrays_Homework;

        import java.util.Arrays;
        import java.util.Scanner;


public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("5 adet sayı giriniz hem düz hem tersten yazdıralım : ");
        int arr[]= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". indeks elemanını giriniz: ");
            arr[i]=scan.nextInt();
        }
        System.out.println("Girdiğiniz sıraya göre sayılar böyle bir dizi oluşturmaktadır : " +Arrays.toString(arr));
        for(int i=4; i>0; i--){
            System.out.print( arr[i]+ " ");
        }
        System.out.println(" Giriş sırasının tersine göre girdiğiniz sayılarınız  ");


    }
}
