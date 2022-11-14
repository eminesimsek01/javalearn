package j16_ArrayList.Tasks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
                /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */
        String isimArr[][]={{"Ali", "Veli", "Ayse"},{"Hasan","Can"},{"Suzan"}};
        List<String> isimList=new ArrayList<>();//boş list>

        for(int i=0; i<isimArr[i].length; i++){
            for(int j=0; j<isimArr[i].length; j++){//her katın daire kontrolü
                isimList.add(isimArr[i][j]);//her katın dairesindeki eleman döngü ile alınıp boş liste atandı

            }
        }
        System.out.println("isimList"+isimList);

        Collections.sort(isimList);//isimList naturel sıralandı
        System.out.println("isimList = " + isimList);//sıralama sonrası


    }
}
