package j36_Map;

import java.util.*;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */
     static Map<String, Integer>kelimesayısı=new HashMap<>();
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Bir metin giriniz: ");
        String metin=scan.nextLine();
        System.out.println(metin);
        metinparcala(metin);

    }
    public static void metinparcala(String metin){
        ArrayList<String>kelimeler=new ArrayList<>(Arrays.asList(metin.split(" ")));
        System.out.println(kelimeler);

        for (String w:kelimeler){
            if (!kelimesayısı.containsKey(w)) {
                kelimesayısı.put(w,1);
            }
            else kelimesayısı.put(w,kelimesayısı.get(w)+1);

        } System.out.println(kelimesayısı);

    }
}
