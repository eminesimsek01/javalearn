package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Mesai başlama saatini yazınız : ");
        double start=scan.nextDouble();
        System.out.println("Mesai bitis saatini yazınız : ");
        double finish=scan.nextDouble();

        System.out.println("Mesai saat ücretini yazınız : ");
        double saatucret=scan.nextDouble();

        System.out.println("Fazla mesai ucret katsayısını yazınız :");
        double ucretkatsayı=scan.nextDouble();
        System.out.println(ucretHesapla(20.0,9.0,5.0,10.0));
        System.out.println(ucretHesapla(start, finish, saatucret, ucretkatsayı));


    }

    private static <ucretkatsayı> double ucretHesapla(double start, double finish, double saatücreti, double ucretkatsayı) {

        double yevmiye=(17-start)*saatücreti;
        double yevmiye2=(finish-17)*saatücreti*ucretkatsayı;
        return yevmiye+yevmiye2;

    }

    }

