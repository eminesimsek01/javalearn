package j01_CodeChallenge.OtuzBirEkim;

public class Question7 {
    public static void main(String[] args) {
         /* verilen sayi icin carpim tablosu olusturun
        Ornek :
            input  : 5
            output : 1  2  3  4  5
                     2  4  6  8 10
                     3  6  9 12 15
                     4  8 12 16 20
                     5 10 15 20 25

     */

            //Call to multipleTable method inside main method

            // Create a method an integer as parameter
            carpimtablosu();
    }

    public static void carpimtablosu(){
        for(int i = 1 ; i<=5;i++) {
            for(int j = 1; j<=5;j++) {
                int sayiD=i*j;
                System.out.printf("%-5d" , sayiD);
            }System.out.println();
        }
    }
    }

