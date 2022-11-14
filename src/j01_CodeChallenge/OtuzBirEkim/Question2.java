package j01_CodeChallenge.OtuzBirEkim;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question2 {
    public static void main(String[] args) {

        // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // Asia/Tokyo nun saat dilimine gore saat ?
        // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyo);
    }
}
