import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ad ve soyadnızı arada boşluk bırakacak şekilde giriniz;");
        String ad=scan.next().trim().toUpperCase();
        String ikinciad=scan.next().trim().toUpperCase();
        String soyad=scan.next().trim().toUpperCase();
        System.out.println(ad.charAt(0)+"."+ikinciad.charAt(0)+"."+soyad.charAt(0));


    }
}
