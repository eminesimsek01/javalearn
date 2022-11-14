import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz : ");
        String kelime=scan.nextLine();
        System.out.println("kelimenin yarısı " + kelime.substring(0, kelime.length() / 2));
    }
}
