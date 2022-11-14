package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
    Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz ");
        String kelime=scan.nextLine();
        System.out.println(hackerdili(kelime));
    }

    private static <string> String hackerdili(String kelime) {
        kelime=kelime.replace('s','5');
        kelime=kelime.replace('a','4');
        kelime=kelime.replace('e','3');
        kelime=kelime.replace('i','1');
        kelime=kelime.replace('o','0');
        return kelime;

    }
    }


