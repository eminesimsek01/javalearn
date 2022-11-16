package j33_Interface;

public interface dısDonanım {
    public void kapı();//abs method
    void kaporta();//abs method
    String RENK="opak gırmızııı";//public static final variable
    public default String sisLamp(){//default conc. method
        return "sisli havada dikkat";
    }
    static void aga(){
        System.out.println("agam sensiz olmaz o-la-mazzz");
    }
    //public static default void sorunMethode(){//CTE->Static default keyword aynı anda kullanılmaz
     static void anten() {
         System.out.println(" agam yine antin kuntin işlerdesin ");
     }
    }
    //dısDonanım obj=new dısDonanım();//'dısDonanım' is abstract; cannot be instantiated, obje üretilemez

    //public static void main(String[] args) {//Projede tek bir main method ve main Class kullanılmalı
    //    System.out.println("RENK"+ RENK);
    //    aga();//static method call


