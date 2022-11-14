package j18_Constructor;

public class C05_Arac {
    //Fields: Objenin üretilirken alacağı değer variables
    //Bir class'da birden çok constructor tanımlanabilir.
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
       Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
        birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
                */
    int maxHız;
    String model;

    public C05_Arac(int maxHız) {//Bir parametreli constructor
        this(180,"hacıMurat");//2p^li cons. call edildi...ilk satıra yazılmalı, yoksa cte verir.
        maxHız=maxHız;//this olmadığı için parametre değeri instance variable'a atanmaz. Obj
        this.maxHız = maxHız;
    }


    public C05_Arac(int maxHız, String model) {//2 p'li constructor
        this.maxHız = maxHız;
        this.model = model;
        System.out.println(" agam bu yazıyı okuduysan 2p'li cons. call edilmiştir.");
    }

    public C05_Arac() {
    }
}
