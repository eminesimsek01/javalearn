package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String name = "Haluk";
        int yas = 33;
        System.out.println(name.toUpperCase());//HALUK

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        //TASK id ve tc String değerlernin toplamını print eden code yazınız
        String id="98765";
        String tc="11223344";
        System.out.println(tc+id);//concat-> birleştirme : 123445598765

        int yeniTC=  Integer.valueOf(tc);// tc String değerini int cevirdi ve yeniTC'ye atadı
        System.out.println("yeniTC = " + yeniTC);

        int yeniId=  Integer.valueOf(id);// tc String değerini int cevirdi ve yeniId'ye atadı
        System.out.println("yeniId = " + yeniId);

        System.out.println(yeniId+yeniTC);// aritmetik toplama->1333220
        String okulNo="2345431" + "";
        int yeniOkulNo= Integer.valueOf(okulNo);// run time Exception-> çalışma zamanı hatası
        System.out.println("yeniOkulNo = " + yeniOkulNo);//runtime'da kod kırıldığı için aşağıda bulunan
                                                         //kodlar çalışmaz

        System.out.println( "madem geldin Dünya'ya otur çalış Javaya");
        //Task-> byte short int maximum ve minimum değerlerini print eden code yazınız
        byte maxByteDegeri=Byte.MAX_VALUE;
        byte minByteDegeri=Byte.MIN_VALUE;
        System.out.println(maxByteDegeri);
        System.out.println(minByteDegeri);

        int maxIntDegeri=Integer.MAX_VALUE;
        int minIntDegeri=Integer.MIN_VALUE;
        System.out.println(maxIntDegeri);
        System.out.println(minIntDegeri);
        System.out.println("maxIntDegeri = " + maxIntDegeri);

        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5
    }


}
