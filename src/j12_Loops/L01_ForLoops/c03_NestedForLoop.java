package j12_Loops.L01_ForLoops;

public class c03_NestedForLoop {
    public static void main(String[] args) {
        //Eğer bir döngünün body'sinde başka bir döngü bulunuyorsa bu tür döngülere nested loop-içiçe döngü denir.
        //İç döngü dış döngünün her adımında çalışır.
        //İçiçe döngülerde en içteki döngü en önce çalışır.

       //for (int apt=0; apt<=10; apt++) {
       //    System.out.println("dış döngü"+i);
       //    for(int daire=1; daire<6; daire++) {
       //        //iç döngü
       //        System.out.println("i"+apt+"");
       //    }
       //}

        for (int apt=0; apt<=4; apt++) {
            System.out.println("#");
            for(int daire=0; daire<=4; daire++) {
                //iç döngü
                System.out.print("#");
            }
        }

    }


}
