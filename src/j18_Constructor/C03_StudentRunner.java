package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogrc1=new C03_Student ();//ogrc obj create
        ogrc1.ad="Fatih";
        ogrc1.soyad="Ataş";
        ogrc1.sınıf=1;
        ogrc1.okulNo=1001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;
        System.out.println(ogrc1);
        ogrc1.mezuniyet();//agam diploman hayırlı olsun :)

        //Task
        C03_Student ogrc2=new C03_Student ();
        ogrc2.ad="Emine";
        ogrc2.soyad="Sarıkaya Şimşek";
        ogrc2.sınıf=4;
        ogrc2.okulNo=790;
        ogrc2.ortalama=90;
        ogrc2.takdir=true;
        System.out.println(ogrc2);
        ogrc2.mezuniyet();
    }
}
