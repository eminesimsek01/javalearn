package j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin dgshn=new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.motor();
        dgshn.sisLamp();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        dgshn.yakıt();
        System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);
        //icDonanım.KUMAS="deri";//Cannot assign a value to final variable 'KUMAS'//CTE
        System.out.println("icDonanım.KUMAS = " + icDonanım.KUMAS);
        System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);
        System.out.println("icDonanım.KUMAS = " + icDonanım.KUMAS);
        System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);
        dısDonanım.anten();//static conc method interface name ile call


    }
}
