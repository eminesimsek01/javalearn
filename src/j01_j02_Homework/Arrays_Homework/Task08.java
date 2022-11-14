package j01_j02_Homework.Arrays_Homework;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        /*
        Scanner scan=new Scanner(System.in);
        int arrayboyut=7;

        int arr[]=new int [arrayboyut];
        for (int i=0; i<arrayboyut; i++){
            System.out.println(i+ ". index elemanını giriniz :");
            arr[i]=scan.nextInt();


        }
        System.out.println(" İstediğiniz array: "+Arrays.toString(arr));
        for (int i=0; i<arrayboyut; i++){

                if (arr[i]%2==1){
            System.out.println(" Tek olan dizi elemanı :"+arr[i]);}
        }

       */

        int arr[]={ 34, 45, 67, 79, 81, 2, 5,};
        int arrayboyut =7;
        for(int i=0; i<arrayboyut; i++){
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
