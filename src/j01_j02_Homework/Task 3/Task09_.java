import java.util.Scanner;

public class Task09_ {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sırayla çiftliğinizde bulunan ineklerin, koyunların ve tavukların sayısını giriniz : ");
        int inek=scan.nextInt();
        int koyun=scan.nextInt();
        int tavuk=scan.nextInt();
        int inekA=inek*4;
        int koyunA=koyun*4;
        int tavukA=tavuk*2;
        System.out.println("Çiftliğinizdeki ineklerin ayak sayısı : "+inekA+" Çiftliğinizdeki koyunların ayak sayısı : "
                           +koyunA+" Çiftliğinizdeki tavukların ayak sayısı : "+tavukA);

    }

}
