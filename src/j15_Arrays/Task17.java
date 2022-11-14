package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {
    //task-> sayı arrayindeki en büyük elemanı print eden code create ediniz.//Interviewlük Soru
        int sayı[][]={{1, 2, 3},{9, -8},{24,10,-41}};//24
        int maxEleman=sayı[0][2];//3
        for (int kat=0; kat<sayı.length; kat++){
            for(int daire=0; daire<sayı[kat].length; daire++){
                if (sayı[kat][daire]>maxEleman){
                    maxEleman=sayı[kat][daire];
                }
            }
        }
        System.out.println(maxEleman);//24
    }
}
