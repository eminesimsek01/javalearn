package j13_BreakContinue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
        /*
  break oradan sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
  kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
  herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
  loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
  satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


  temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır

         */
        // Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Agam neyini hesabını istersen ");
        String meyil = scan.nextLine();
        for (int i = 0; i < meyil.length(); i++) {//0. indexten meyilin son indexe kadar her bir karakteri döngüye alır.
            char c = meyil.charAt(i);//döngüdeki her bir karakteri c'ye atar
            if (c == '@') {//c'de @ karakteri varsa if blok run edilir.
                break;//if bloku sonlandırır loopu kırar.
            }
            System.out.println(c);//loop'da elde edilen karakterleri c'ye atayıp print eder.


        }
    }
}