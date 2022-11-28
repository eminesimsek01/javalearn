package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_object {
    public static void main(String[] args) {
           /*
           TASK :
           fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
           */

        Universite u01=new Universite("Boğaziçi","matematik",571,73);
        Universite u02=new Universite("Istanbul","matematik",571,77);
        Universite u03=new Universite("Marmara","huku",571,52);
        Universite u04=new Universite("Itu","uçak müh.",571,63);
        Universite u05=new Universite("Yıldız Teknik","gemi",571,55);
        List<Universite> unv=new ArrayList<> (Arrays.asList(u01,u02,u03,u04,u05));
    }//main sonu
    //task01-->notOrt'larının 74'den büyük olduğunu kontrol eden pr create ediniz.

    public static boolean notOrt74Byk(List<Universite>unv){

        return unv.
                stream().
                allMatch(t->t.getNotOrt()>74);
    }
}
