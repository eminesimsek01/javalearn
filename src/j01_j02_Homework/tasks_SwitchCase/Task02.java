package j01_j02_Homework.tasks_SwitchCase;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        int eklenecekgun=100%7;
        switch (kacıncıGun){
            case 1:
                System.out.println("100 gün sonra Çarşamba günüdür Haftanın "+eklenecekgun+kacıncıGun+" günü");
                break;
            case 2:
                System.out.println("100 gün sonra Perşembe günüdür Haftanın "+eklenecekgun+kacıncıGun+" günü");
                break;
            case 3:
                System.out.println("100 gün sonra Cuma günüdür Haftanın "+eklenecekgun+kacıncıGun+" günü");
                break;
            case 4:
                System.out.println("100 gün sonra Cumartesi günüdür Haftanın " +eklenecekgun+kacıncıGun+" günü");
                break;
            case 5:
                System.out.println("100 gün sonra Pazar günüdür Haftanın " +eklenecekgun+kacıncıGun+" günü");
                break;
            case 6:
                System.out.println("100 gün sonra Pazartesi günüdürHaftanın"+eklenecekgun+kacıncıGun+" günü");
                break;
            case 7:
                System.out.println("100 gün sonra Salı günüdür Haftanın"+eklenecekgun+kacıncıGun+" günü");
                break;

        }




    }
}

