package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {
        int sayı[][]={{1, 2, 3},{9, 8},{24,0,4}};

        int crpm=1;
        for(int kat=0; kat<sayı.length; kat++){
                crpm*=sayı[kat][sayı[kat].length-1];
        }
        System.out.println("Dizideki elemanların çarpımı : "+crpm);
    }
}
