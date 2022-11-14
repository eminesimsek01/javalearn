package j08_ifStatement;

public class c01_ifStatement {
    public static void main(String[] args) {
        int krmYas=45;
        int ismlYas=63;
        if (krmYas==ismlYas){
            System.out.println("aynı yaştasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz? ");
        }
    if (krmYas>=40)
        System.out.println("krm bey olgunluk yaşındasınız ");
        System.out.println("Bu yazıyı okuduysanız 12. satırdaki if'ten bağımszı");
        //If bloktan sonra süslü parantez olmazsa il ;'e kadar olan komut çalışır veya çalışmaz alt satırdan devam eder.

    if (krmYas+ismlYas>100) {
        System.out.println("Kerim bey ve ismail beyin yaşları 100'den büyük ");
    }
        System.out.println("Selam Javacanlar");
    /*
    Bağımsız if statement yapıları sadece kendi skopunda çalışır.
    Birden fazla bağımsız if statement yapıları hepsinin body kodu çalışabileceği gibi hiçbirinin
    body kodu da çalışmayabilir.
     */
        }
}
