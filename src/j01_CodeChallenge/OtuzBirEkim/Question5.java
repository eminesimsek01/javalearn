package j01_CodeChallenge.OtuzBirEkim;

public class Question5 {
    public static void main(String[] args) {
    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...
        System.out.println(toplam(1, 4, 5, 6, 78));
    }
    public static int toplam(int ... a) {
        int toplam=0;
        for(int value : a) {
            toplam+=value;}
        return toplam;
    }
}
