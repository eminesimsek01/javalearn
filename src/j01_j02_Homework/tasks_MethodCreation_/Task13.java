package j01_j02_Homework.tasks_MethodCreation_;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */

        //String x="feminine";
        //String y="nine";
        //String z="tio";
        
        Scanner scan=new Scanner(System.in);
        System.out.println("İki kelime giriniz :");
        String x=scan.next();
        String y=scan.next();


        System.out.println(kontrolEt(x, y));

    }

    public static boolean kontrolEt(String x, String y) {
        boolean flag=false;
        if (x.endsWith(y)) {
            flag =true ;
        } return flag;

    }



    }
