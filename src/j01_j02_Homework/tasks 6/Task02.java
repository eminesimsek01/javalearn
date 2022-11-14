import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("password girişi yapınız : ");
        String password = sc.nextLine();

        System.out.println((password.length()>=6?(password.charAt(0)>='A'&&password.charAt(0)<='Z'?
                (password.charAt(password.length()-1)>=0&&password.charAt(password.length()-1)<=9?"şifre geçerli":"son basamak sayı olmalı"):"ilk karakter büyük " +
                "harf olmalı"):"şifre 6 karakterden oluşmalı"));
    }
}
