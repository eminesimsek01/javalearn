import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ad ve soyadnızı arada boşluk bırakacak şekilde giriniz;");
        String ad=scan.next();
        System.out.println("Ad :"+ ad.trim());
        String soyad=scan.next();
        System.out.println("Soyad : "+soyad.trim());

    }
}
