package j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {
        C01_InstanceVariable kus=new C01_InstanceVariable();//İstediğim class'tan kuş objesi create edildi.
        kus.name="ebabil";
        kus.developerMı=false;

        System.out.println(" kus name = "+ kus.name);//hüma
        C01_InstanceVariable.staticMethod();//CLASS NAME İLE STATİC METHOD CALL
        kus.non_staticMethod();//obj ile non-static method getirdik
    }
}
