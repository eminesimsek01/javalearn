package j12_Loops.L01_ForLoops;

public class c01_ForLoop {
    public static void main(String[] args) {
        //41 kere maşallah print ediniz
        for (int i = 0; i <= 41; i += 5) {
            System.out.println(+i + ".  Maşallah :)");

        }
        System.out.println(". Selam Javacanlar offer ");//Döngü dışı bir kez run eder
        //Task->
        // 2 basamklı tek sayıları create eden code
        for (int i = 11; i <= 99; i += 2) {
            System.out.print(+i);
        }
        System.out.println("**********");
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 1)
                System.out.println(i + "      ");
        }
        //Task->
        for (int i = 0; i > 10; i++) {
            System.out.println(+i + " Selam Javacan  :)");//Bu body çalışmaz //Şartı sağlamayan ->False olan for body run olmaz
            //kod kırılarak sıradaki satırdan devam eder.
        }

        //for(int i=0; i>=0; i++ ){ //Bu döngü sonsuza kadar çalışır .
          //  System.out.println(i);
        }
    }


