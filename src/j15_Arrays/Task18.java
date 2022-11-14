package j15_Arrays;

public class Task18 {
    public static void main(String[] args) {
        //task-> sayı arr'deki iç arr'lerin toplamını yeni bir arr'e atayıp print eden code create ediniz.
        // input:   int sayı[][]={{1, 2, 3},{19, -8},{24,10,-41}};//24
        // output:  int yeniArr[]={6, 11, -7}
        int sayı[][]={{1, 2, 3},{19, -8},{24,10,-41}} ;

        int toplam1=0;
        int toplam2=0;
        int toplam3=0;
        for (int kat=0; kat<sayı.length; kat++){
            if (kat==0){
                for(int daire=0; daire<sayı[kat].length; daire++) {
                    toplam1=sayı[kat][daire];
                }
            }
            if (kat==1){
                for(int daire=0; daire<sayı[kat].length; daire++) {
                toplam2=sayı[kat][daire];
            }
            }
            if (kat==2){
                for(int daire=0; daire<sayı[kat].length; daire++) {
                    toplam3=sayı[kat][daire];
                }
            }
        }
        int[] yeniArr= new int []{toplam1, toplam2, toplam3};
        System.out.println( yeniArr.toString());



    }
}
