package j17_ForEachLoop;

public class C04_ForEachLoop {
    public static void main(String[] args) {
      //bir int array elemanlarının işaretini değiştiren bir method.
        int arr[]={1, 2, -3, 4, -5, -6};
        sayınıtTersi(arr);
        }
    private static void sayınıtTersi(int[] arr) {
        for(int a:arr) {
            a*=-1;
            System.out.print(a+ " ");
        }
    }
}

