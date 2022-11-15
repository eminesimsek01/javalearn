package j01_CodeChallenge.OnDörtKasım;

public class Q1farklıcozum {
    public static void armstrongSayi(int a) {
        String str = String.valueOf(a);
        int toplam=0;
        for(int i = 0;i<=str.length()-1;i++) {
            toplam+=(int)Math.pow(Integer.parseInt(""+str.charAt(i)), str.length());
        }
        System.out.println(toplam==a? "Armstrong sayı" : "Armstrong sayı değil");
    }
}
