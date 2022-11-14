package j13_BreakContinue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        //task-> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        String dogruPin="javaCAN";
        int girisHakkı=3;
        while(true) {
            System.out.println("Pin giriniz :");
            String pin=sc.nextLine();
            if (pin.equals(dogruPin)) {
                System.out.println("agam bugün ballısın gayet başarılı ");
                break;
            }
            else {
                System.out.println("agam bugün nasipsizsen bir daha dene");
                girisHakkı--;
                System.out.println("kalan hakkın "+girisHakkı);
                if (girisHakkı==0){
                    System.out.println(" agam canın kalmadı, bekleme devamkee :(");
                    break;
                }
            }
        }
    }
}
