package j01_CodeChallenge.OtuzBirEkim;

import java.time.LocalTime;

public class Question3 {
    public static void main(String[] args) {
        //Local time ile her dakikanın ilk 10 saniyesi
        int second = LocalTime.now().getSecond();
        if (second<10)
            System.out.println("Evet");
        else
            System.out.println("Hayır");
    }
}
