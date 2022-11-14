package EmailCreationProjects;

import java.util.Scanner;

public class User {
    /*
    İşe yeni başlayan arkadaşlarımızın kullanımı için arkadaşlara şirket maili ve şifresi create edilip verilmelidir.
            --> ** Bir sonraki sprintte create edilen bu mail otomatik olarak IT Manager, HR Manager, Team Lead e mail atılacaktır. Bunu göz önünde bulundurarak proglama yapınız.
    Nitelikler:
    firtsName: Çalışan İsmi
    lastName: Çalışan soyadı
    passWord: Çalışan şifresi
    department: Çalışılacak Departman
    email: Çalışan Email
    emailSuffix: Şirket Domaini (clarusway.com)
    mailBoxCapasity : 1000
    defaultpassWordLenght : 12

    Metotlar:
    Çalışanın adı ve soyadı alacak şekilde parametreli bir construcor create ediniz (firtsName,lastName)

    setDepartment fonks. creat ediniz. Bu fonk çalışanın departmanını setlemek için kullanılmalıdır.
    Şirket departmanları aşağıdaki tabloda belirtilmiştir. Çalışanın istihdam edileceği departman emailine eklenecektir.
            testautomation.
            fullstackdeveloper.
            salesforce.
            hiçbiri (Eğer çalışan yukarıda ki departmanlardan birinde istihdam edilmiyorsa mailine departman setlenmemelidir.)

    setRandomPassWord() password ün uzunluğunu alarak random bir şekilde password create edebilen bir fonk. olmalıdır.
    Kullanıcının passwordun de aşağıda belirtilmiş numeric, alphabetic ve speacil karakterler bulunabilir.
    ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi

    showInfo() çalışanın adı, soyadı, email, password unu konsolda gösterecek bir metot oluşturunuz.
            7:37
            ** Java ile otomatic olarak mail atmasını nasıl sağlayabilirim
    public static void main(String[] args) {
     */
    String firstName;
    String lastName;
    String passWord="";
    String department;
    String eMail;
    String emailSuffix = "clasrusway.com";//Şirket domaini
    int mailBoxCapasity = 1000;
    int defaultPassWordLenght = 12;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        //System.out.println("this.department=setDepartment() = " + department);

        this.passWord = setRandomPassWord(defaultPassWordLenght);
        //System.out.println("passWord = " + passWord);

        eMail = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+emailSuffix;

    }

    public String setDepartment() {
        System.out.println("Lütfen aşağıda belirtilen departmanlardan herhangi birini giriniz :\n+" +
                "\n1TestAutomation \n2FullStackDeveloper \n3Salesforce \n=Hiçbiri ");
        Scanner scan = new Scanner(System.in);
        int options = scan.nextInt();
        String str = "";
        if (options == 1) {
            return "testautomation";
        } else if (options == 2) {
            return "FullStackDeveloper";
        } else if (options == 3) {
            return "Salesforce";
        } else if (options == 0) {
            return "";
        } else return "";
    }

    public String setRandomPassWord(int length) {
        String passwrodpool ="ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        for (int i = 0; i < defaultPassWordLenght; i++) {
            passWord+=passwrodpool.charAt((int) (Math.random() * defaultPassWordLenght));
        }
        return passWord;
    }

    public String showInfo() {

        return "Ad:" + firstName + " " + lastName + "\n" + "Sirket Email: " + eMail + "\n" + "password" + passWord;
    }
}


