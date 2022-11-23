package DepoYöntemi_Team06;
import java.util.Scanner;

public class Islemler {
    static Scanner scan=new Scanner(System.in);
    public static int tryCatch(){



        int a;
        while (true){
            try {
                a= scan.nextInt();break;
            } catch (Exception e) {
                System.out.println("Lütfen rakamsal değer giriniz");
                scan.nextLine();
            }
        }

        return a;
    }
}
