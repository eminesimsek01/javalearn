package j01_j02_Homework.tasks_If;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println( "Hız ");
        int currentSpeed = scan.nextInt();
        System.out.println(" Is driver license available? ");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (currentSpeed>55&&currentSpeed<74){if (isDriverLicenceAvailable==true){
            System.out.println("Cezanız 100$"); } else System.out.println("Cezanız 300$");
        }
        else if (currentSpeed>75&&currentSpeed<84){if (isDriverLicenceAvailable==true){
            System.out.println("Cezanız 150$"); } else System.out.println("Cezanız 350$");
        }
        else if (currentSpeed>85&&currentSpeed<94){if (isDriverLicenceAvailable==true){
            System.out.println("Cezanız 320$"); } else System.out.println("Cezanız 520$");
        }
        else if (currentSpeed>94){if (isDriverLicenceAvailable==true){
            System.out.println("Cezanız 500$"); } else System.out.println("Cezanız 700$");
        }
        }



    }



