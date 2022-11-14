package j01_CodeChallenge.OtuzBirEkim;

import java.time.LocalDate;

public class Question1 {
    public static void main(String[] args) {

        // Bugunun tarihi aliniz, yazdiriniz...
        // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
        // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..
        LocalDate today=LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date1=today.plusYears(1).plusDays(3).plusMonths(1);
        LocalDate date2=date1.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println(date2);
    }
}
