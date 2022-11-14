import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Main fiyatı : ");
        double fiyat=scan.nextDouble();
        System.out.println("Müsteri kartınız varsa Evet, yoksa Hayır giriniz ");
        char ch=scan.next().charAt(0);
        if (ch=='E') {
            System.out.println("Main adedi : ");
            int adet=scan.nextInt();
            if (adet>10){
                System.out.println("%20 indirim hakkınız var. "+"Ürünün fiyatı = "+((adet*fiyat)-((adet*fiyat)*0.2)));
            }
            else if (adet<=10){
                System.out.println("%15 indirim hakkınız var."+"Ürünün fiyatı = "+((adet*fiyat)-((adet*fiyat)*0.15)));
            }
        } else if (ch=='H'){
            System.out.println("Main adedi : ");
            int adet=scan.nextInt();
            if (adet>10){
                System.out.println("%15 indirim hakkınız var. "+"Ürünün fiyatı = "+((adet*fiyat)-((adet*fiyat)*0.2)));
            } else if (adet<=10){
                System.out.println("%10 indirim hakkınız var. "+"Ürünün fiyatı = "+((adet*fiyat)-((adet*fiyat)*0.1)));
            }
        }








    }

}
