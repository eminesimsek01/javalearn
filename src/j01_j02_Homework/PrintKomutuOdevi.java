package j01_j02_Homework;

import java.sql.SQLOutput;

public class PrintKomutuOdevi {
    public static void main(String[] args) {
        System.out.println("\"Hello\",\"World\\ /\"");
        /*
        java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp
        \n or \r: Starts from a new line. Metni bir alt satırdan itibaren yazdırır
        \t: Horizontal Tab. Metni yatayda bir tab miktarı kadar kaydırır.
        \\: Prints a back slash
        \': Prints single quote. Tek tırnak yazdırır
        \": Prints double quote: Çift tırnak yazdırır.


         */
        System.out.println("P\nA\nZ\nA\nR\nT\nE\nS\nİ");
        System.out.println("\"Java\" ile hayat çok 'afilli'");
        System.out.println("\"Başarı\" gayrete \'aşıktır\'\n\n\n\t\"Claruway ile Java çok kolay...\"");
        System.out.println("Emine Şimşek\nKilom 52\nBoyum 1.62 m \nHobilerim\nDoğa Yürüyüşü, Fotoğraf çekmek");
        System.out.println("emine \bmehmet"); // \b backspace yani boşluğu kapatır.




    }
}
