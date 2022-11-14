package j14_Scope;

public class C02_StaticVariable {

    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

       Static variabler ise class variable olarak tanimlanir
       ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir


     */
    static String firmaName="clarusway";
    static int firmaID;
    static boolean firmaIT;//güneş
    public static void main(String[] args) {
        System.out.println(firmaID);//0
        firmaID=1001; //static variable name ile call
        System.out.println(firmaID);//1001
        C02_StaticVariable.firmaIT=true; //Class name ile static variable call-> bad practice

        staticMethod(); // static method maine call oldu. Astral seyahat
        //non_StaticMethod(); //sefil dünyalı galaxy'e çıkamaz
    }//main sonu

    public static void staticMethod() {//static method-> galaxy
        firmaID=2002; // static variable call
        System.out.println("agam yeni ıd'ing hayırlı olsun "+firmaID);

    }

    public void non_StaticMethod() {
        firmaName="javaCAN";
        System.out.println("agam yeni firman :"+firmaName);
    }
}

