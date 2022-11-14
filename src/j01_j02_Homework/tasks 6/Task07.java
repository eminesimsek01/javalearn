import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println("Bir indeks numarası giriniz :");
        int indeks=sc.nextInt();
        System.out.println(str.charAt(indeks));

    }
}
