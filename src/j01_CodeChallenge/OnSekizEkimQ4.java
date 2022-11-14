package j01_CodeChallenge;

import java.util.Arrays;

public class OnSekizEkimQ4 {
    public static void main(String[] args) {
        /*
        Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
        String s= Apex,nesne yonelimli bir programlama dilidir"       */
        String s= "Apex, nesne yönelimli bir programlama dilidir";
        s=s.replace(",","").replace(" ","");
        System.out.println(s);//Apexmesmeyeyönelimlibirprogramlamlamadilidir.

        String[]arr=s.split("");
        System.out.println(Arrays.toString(arr));//[A, p, e, x, n, e, s, n, e, y, ö, n, e, l, i, m, l, i, b, i, r, p, r, o, g, r, a, m, l, a, m, a, d, i, l, i, d, i, r]

        String sesliHarfler []={"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliHarfler));//[a, e, i, ö, ü]

        int count=0;
        for (int i=0; i<arr.length; i++){//outer loop
            for (int j=0; j<sesliHarfler.length; j++){
                if(arr[i].equalsIgnoreCase(sesliHarfler[j])){
                    //arr'deki herhangi bir karakter, sesli harflerdeki bir karakterde büyük küçük fark etmez
                    count++;//sesli harf sayısını bir arttır
                }
            }
        }


    }
}
