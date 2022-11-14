package j11_MethodCreation;

public class c01_MethodCreation {
    public static void main(String[] args) {//main method açılış
            /*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tracih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/




        topla();// parametresiz return typı olmayan void bir method call edildi.
        System.out.println("agam bu yazıyı okuduysan ahan da yukarıdaki method çalıştı ");
        topla2(34,38);//parametreli method call
        System.out.println("ahan da topla 3 çalıştı" + topla3());

        //Bir methodu main method içinde call etmek için mutlaka statik keyword kullanılmalı
        //Method parantezinin içinde oluşturulan variablelara parametre denir.
        //Method call edilirken method parantezinin içine yazılan değerlere argument denir.
        //Parametrenin data type'ı ile argumentin data typı birebir eşleşmeli.

        //Bir method class'ın içinde ama main methodun dıiında create edilir.
        //Best practice-> Methodlar main methoddan sonra create edilir.

        System.out.println(topla4("selam", 48));

    }//main method kapanış

    public static int topla4(String str, int a) { //String ve int parametreli int return eden method..
        System.out.println(str);
        return a*2;

    }


    private static int topla3() {//parametresiz ama int return type bir metodtur.

        int a=72;
        int b=63;

        return a+b;
    }

    public static void topla() {//parametresiz return type'ı olmayan void bir method
        int a=33;
        int b=23;
        System.out.println(a+b);
        System.out.println("topla metodundan selamlar :");
    }
    public static void topla2 (int a, int b){//parametreli (2 int) void metodtur.
        System.out.println("Bu method parametreli");
        System.out.println(a+b);
    }
}
