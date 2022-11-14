package j01_CodeChallenge;

public class OnbirEkim_Q1 {
    public static void main(String[] args) {
        int sayı=456789;
        System.out.println(basamakToplamı((int) sayı));
    }

    private static int basamakToplamı(int sayı) {
        return sayı;
        //do while ve for ile çözümü
    }
    /*
    private static int basamakToplamı(int sayı) {
        int toplam=0;
        while(sayı!=0){
            int kalan=sayı%10;
            sayı=sayı/10;
            toplam+=kalan;
        }
        return toplam;
    }
     */
    }
