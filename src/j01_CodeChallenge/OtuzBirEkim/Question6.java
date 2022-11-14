package j01_CodeChallenge.OtuzBirEkim;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Sayıların Çarpımı(2,3,4,5,6) = " + carpim(2, 3, 4, 5, 6));
    }
    public static double carpim(double ... num) {
        int carpim=1;
        for(double value : num) {
            carpim*=value;}
        return carpim;
    }
}
