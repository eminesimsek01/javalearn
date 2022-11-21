package j01_j02_Homework.Sets;

import java.util.HashSet;

public class C01_Set {
    /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
    olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
    public static void main(String[] args) {
        String str = "banana";
        String str2 = "peach";
        HashSet<String>hs=new HashSet<>();
        hs.add("banana");
        hs.add("strawberry");
        hs.add("kiwi");
        hs.add("pineappple");
        System.out.println("changeset(str,str2,hs) = " + changeset(str, str2, hs));
    }

    private static HashSet<String> changeset(String str, String str2, HashSet<String> hs) {
        if (hs.contains(str)) {
            hs.remove(str);
            hs.add(str2);
        }

        return hs;
    }


}
