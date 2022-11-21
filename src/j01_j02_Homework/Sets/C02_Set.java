package j01_j02_Homework.Sets;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class C02_Set {
    public static void main(String[] args) {
        /*
    Task->
    return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
        */
        LinkedHashSet<String> lhs=new LinkedHashSet<>(Arrays.asList("Germany","France","USA","Canada","Mexico","Brazil"));
        String country1= "Germany";
        String country2 = "USA";
        lhs.add(country1);
        lhs.add(country2);
        System.out.println("lhs = " + lhs);
        System.out.println("removing (country1,country2, lhs) = " + removing(country1, country2, lhs));
    }
    private static LinkedHashSet<String> removing(String country1, String country2, LinkedHashSet<String> lhs) {
        lhs.removeIf(Predicate.isEqual(country1));
        lhs.removeIf(Predicate.isEqual(country2));
        return lhs;
    }
    }



