package j33_Interface;

public class Sahin extends Tofas implements dısDonanım, icDonanım, Lastik {
    //conc child class->Tofas, implements ->dısDonanım,icDonanım,Lastik
    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik  ebat :) ");
        System.out.println("Sr bu ne insan yiyecek bunu ");
    }

    @Override
    public void jant() {

    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");
    }

    @Override
    public void yakıt() {
        System.out.println("yakıt çok pahalı aga");
    }

    @Override
    public void kapı() {
        System.out.println("agam 4 kapu sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordiyon kaporta gamzesiz olmazz");
    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk yazın pişik yapar, içi saman olmasın kafi");
    }

    @Override
    public void klima() {
        System.out.println(" klima klimaa");
    }

}
