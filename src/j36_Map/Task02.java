package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */

        Map<String, String> eminekartvizit =new HashMap<>();
        eminekartvizit.put("isim","Emine");
        eminekartvizit.put("email","gmail");
        eminekartvizit.put("adres","çamlica");
        eminekartvizit.put("tel","76876");

        Map<String, String> meymetkartvizit=new HashMap<>();
        meymetkartvizit.put("isim","Meymet");
        meymetkartvizit.put("email", "meygmail");
        meymetkartvizit.put("tel", "45678");
        meymetkartvizit.put("adres", "emek");
        Map<String,Map<String,String>>kartvizitler=new HashMap<>();
        kartvizitler.put("Emine",eminekartvizit);
        kartvizitler.put("Meymet",meymetkartvizit);

        System.out.println(kartvizitler);

    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
