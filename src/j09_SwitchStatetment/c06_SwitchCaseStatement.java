package j09_SwitchStatetment;

import java.util.Scanner;

public class c06_SwitchCaseStatement {
    public static void main(String[] args) {
        //Task-> Giirlen haftanın gününü hafta içi veya haftasonu olduğunu print eden kod.
        Scanner sc=new Scanner (System.in);
        System.out.println("lütfen bir gün giriniz : ");
        String gün = sc.nextLine().toLowerCase();//PAZAR girilse bile firilen harfleri küçültüp anahtara uyduruyor.
        //toUpperCase bütün harfleri büyütüyor. Bu durumda anahatarın iç kısmının da büyük harfli olması lazım.
        switch (gün){
            case"pazartesi"://Ortak aksiyon olduğu için break komutu yazılmadı.
            case"salı"://Ortak aksiyon olduğu için break komutu yazılmadı.
            case"çarşamba"://Ortak aksiyon olduğu için break komutu yazılmadı.
            case"perşembe"://Ortak aksiyon olduğu için break komutu yazılmadı.
            case"cuma"://Ortak aksiyon olduğu için break komutu yazılmadı.
                System.out.println("Haftaiçi");
                break;
            case"cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Yanlış gün girdin aga ");
                //Hiçbir case gerçekleşmezse gerçekleşecek olan aksiyon default..

        }
    }
}
