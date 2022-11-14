package j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While Loop-> önce şart kontrol edilir eğer şart sonucu true alınırsa body action çalışır.
        do-While Loop-> önce bod yaction çalışır sonra şart kontrol edilir. Şart doğru ise döngü devam eder, false ise
        döngü kırılır ve döngüden sonraki ilk satır çalışır.
        do-While Loop-> Game app'de daha çok kullanılır.
        Trick: While loop şart sağlanmazsa hiç çalışmayabilir ama do while şart sağlansın sağlanmasın en az bir kere çalışır.
         */

        int yas=33;
        while (yas<40){
            System.out.println("agam yas "+yas+" gayte başarılı  :)");
            System.out.println("while body action .....");
            yas++;
        }
        do {
            System.out.println(" agam ");
            System.out.println(" do while body action ");
            yas++;
        }while (yas<33);
    }
}
