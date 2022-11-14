package j10_Concatenation;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
      Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
      String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       */
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       char e=pickName.charAt(pickName.indexOf("E"));
       char m=pickName.charAt(pickName.indexOf("M"));
       char i=pickName.charAt(pickName.indexOf("I"));
       char n=pickName.charAt(pickName.indexOf("N"));
       char son=pickName.charAt(pickName.indexOf("E"));
        System.out.println(e+m+i+n+son);//ascii-> toplama
        System.out.println(""+e+m+i+n+son);//string->concat->Emine




    }
}
