package j13_BreakContinue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //task-< Grilen bir ifadedeki c karaketrine kadar a karakter sayısını print eden kod yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("String giriniz : ");
        String kelime=scan.nextLine();
        int numa=0;
        for(int i=0; i<kelime.length(); i++){
            char ch=kelime.charAt(i);
            if (ch== 'a'){
                numa++;
            }
            else if (kelime.charAt(i)=='c') {
                break;
            }
            System.out.println("işleme giren :" +kelime.charAt(i));
        }

        System.out.println(numa);//



    }
}
