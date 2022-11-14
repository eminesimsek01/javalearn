package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int arr[][]={{2, 3},{4},{5,6,7}};
        int çarpım=1;
        for(int [] i : arr) {
            for ( int j :i){
           çarpım*=j;
            }
        }
        System.out.println(çarpım);









    }
}
