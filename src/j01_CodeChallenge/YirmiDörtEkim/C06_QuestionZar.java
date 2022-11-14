package j01_CodeChallenge.YirmiDörtEkim;

public class C06_QuestionZar {
    public static void main(String[] args) {
        int min=1;
        int max=6;
        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(randomNum);
        int randomNum1 = (int) (Math.random() * ((max - min)+1)+min);
        System.out.println(randomNum1);
        System.out.println((randomNum1 + randomNum == 9 ? "Kazandınız" : "Tekrar deneyiniz"));

    }
}
