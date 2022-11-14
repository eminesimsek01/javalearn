package j01_CodeChallenge.YirmiDörtEkim;

public class Q5_Question {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cift sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

        //1.yol
        int min = 50;
        int max = 120;

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNum = " + randomNum);

        System.out.println(randomNum % 2 == 0 ? "cift" : "tek");

        //2.yol
        int randomSayi = (int) (Math.random()*80);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println(randomSayi %2 == 0 ? "cift" : "tek");

      // int min=10;
      // int max=67;
      // int randomNum=(int) (Math.random()*((max-min) + 1));
      // System.out.println(randomNum);
      // if (randomNum%2==0){
      //     System.out.println("çift sayı");
      // }
      // else System.out.println("tek sayı");
    }
}
